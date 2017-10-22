package com.temelt.coursemgmt.gui.yonetim;

import com.temelt.coursemgmt.model.ik.Ogretmen;
import com.temelt.coursemgmt.model.yonetim.Grup;
import com.temelt.coursemgmt.model.yonetim.Kurs;
import com.temelt.coursemgmt.model.yonetim.Salon;
import com.temelt.coursemgmt.service.ik.OgretmenService;
import com.temelt.coursemgmt.service.yonetim.GrupService;
import com.temelt.coursemgmt.service.yonetim.KursService;
import com.temelt.coursemgmt.service.yonetim.SalonService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class frmYonetimGrupDuzenle extends javax.swing.JDialog {

    GrupService grupService = new GrupService();
    KursService kursService = new KursService();
    OgretmenService ogretmenService = new OgretmenService();
    SalonService salonService = new SalonService();
    static Integer tarihOnay;

    public frmYonetimGrupDuzenle(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        combolariDoldur();
        DuzenlecekGrup(frmYonetimGrupIslemleri.duzenleId);
        setLocationRelativeTo(null);
        this.show();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbOgretmen = new javax.swing.JComboBox<>();
        cmbBitisGun = new javax.swing.JComboBox<>();
        cmbKurs = new javax.swing.JComboBox<>();
        cmbBaslangicGun = new javax.swing.JComboBox<>();
        cmbBitisAy = new javax.swing.JComboBox<>();
        cmbBaslangicAy = new javax.swing.JComboBox<>();
        cmbBitisYil = new javax.swing.JComboBox<>();
        cmbBaslangicYil = new javax.swing.JComboBox<>();
        cmbSalon = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnOnayla = new javax.swing.JButton();
        txtGrupAdı = new javax.swing.JTextField();
        btnVazgec = new javax.swing.JButton();
        txtGrupId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cmbOgretmen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbBitisGun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbKurs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbBaslangicGun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbBitisAy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbBaslangicAy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbBitisYil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbBaslangicYil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbSalon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Gün :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Grup Adı :");

        jLabel9.setText("Ay :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Başlama Tarihi :");

        jLabel10.setText("Yıl :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Bitiş Tarihi :");

        jLabel11.setText("Gün :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Öğretmen Adı :");

        jLabel12.setText("Ay :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Kurs Adı :");

        jLabel13.setText("Yıl :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Salon Adı :");

        btnOnayla.setText("Onayla");
        btnOnayla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnaylaActionPerformed(evt);
            }
        });

        btnVazgec.setText("Vazgeç");
        btnVazgec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVazgecActionPerformed(evt);
            }
        });

        txtGrupId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtGrupId.setText("Grup Id :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(btnVazgec, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtGrupId))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbSalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnOnayla, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cmbBitisGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmbBaslangicGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmbBaslangicAy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cmbBitisAy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmbBitisYil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmbBaslangicYil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(cmbOgretmen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbKurs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtGrupAdı)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtGrupAdı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGrupId))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(cmbBaslangicGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBaslangicAy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBaslangicYil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(cmbBitisGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBitisAy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBitisYil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbKurs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbOgretmen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbSalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVazgec, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOnayla, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DuzenlecekGrup(Long girilenId) {

        Date bugun = new Date();
        Grup grup = grupService.getById(girilenId);
        Calendar calendar = Calendar.getInstance();

        if (grup.getBaslamaTarihi().before(bugun)) {
            tarihOnay = 1;
        }

        calendar.setTime(grup.getBaslamaTarihi());
        int baslamaYil = calendar.get(Calendar.YEAR);
        int baslamaAy = calendar.get(Calendar.MONTH);
        int baslamaGun = calendar.get(Calendar.DAY_OF_MONTH);

        cmbBaslangicGun.setSelectedIndex(baslamaGun - 1);
        cmbBaslangicAy.setSelectedIndex(baslamaAy - 1);
        cmbBaslangicYil.setSelectedIndex(baslamaYil - 1);

        calendar.setTime(grup.getBitisTarihi());
        int bitisYil = calendar.get(Calendar.YEAR);
        int bitisAy = calendar.get(Calendar.MONTH);
        int bitisGun = calendar.get(Calendar.DAY_OF_MONTH);

        cmbBitisGun.setSelectedIndex(bitisGun - 1);
        cmbBitisAy.setSelectedIndex(bitisAy - 1);
        cmbBitisYil.setSelectedIndex(bitisYil - 1);

        txtGrupId.setText("Grup ID : " + grup.getId().toString());
        txtGrupAdı.setText(grup.getAdi());
        cmbKurs.setSelectedItem(grup.getKurs().getAdi());
        cmbOgretmen.setSelectedItem(grup.getOgretmen().getAd());
        cmbSalon.setSelectedItem(grup.getSalon().getKod());

//        grup.getBaslamaTarihi();
//        grup.getBitisTarihi();
//        grup.getKurs().getAdi();
//        grup.getOgretmen().getAd();
//        grup.getSalon().getKod();
    }

    private void btnOnaylaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnaylaActionPerformed

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Grup grup = new Grup();
        Date bugun = new Date();
        int baslamaGun = cmbBaslangicGun.getSelectedIndex() + 1;
        int bitisGun = cmbBitisGun.getSelectedIndex() + 1;
        int baslamaAy = cmbBaslangicAy.getSelectedIndex() + 1;
        int bitisAy = cmbBitisAy.getSelectedIndex() + 1;
        int baslamaYil = cmbBaslangicGun.getSelectedIndex() + 1;
        int bitisYil = cmbBitisGun.getSelectedIndex() + 1;

        int onay = 0;
        int sonuc = 1;
        try {
            Date baslamaTarihi = simpleDateFormat.parse(baslamaGun + "." + baslamaAy + "." + baslamaYil);
            Date bitisTarihi = simpleDateFormat.parse(bitisGun + "." + bitisAy + "." + bitisYil);

            if ((tarihOnay == 1) || (baslamaTarihi.after(bugun) && bitisTarihi.after(baslamaTarihi))) {
                grup.setBaslamaTarihi(baslamaTarihi);
                grup.setBitisTarihi(bitisTarihi);
                onay = 1;
            } else {
                sonuc = JOptionPane.showConfirmDialog(this, "Uyumusuz Tarih ! Tarih Kaydı Olmadan GruP kaydedilsin mi ?", "Hata", 2);
            }

        } catch (ParseException ex) {
            Logger.getLogger(frmYonetimGrupEkle.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (onay == 1 || sonuc == 0) {
            grup.setAdi(txtGrupAdı.getText());
            Ogretmen ogretmen = (Ogretmen) cmbOgretmen.getSelectedItem();
            grup.setOgretmen(ogretmen);

            Kurs kurs = (Kurs) cmbOgretmen.getSelectedItem();
            grup.setKurs(kurs);

            Salon salon = (Salon) cmbOgretmen.getSelectedItem();
            grup.setSalon(salon);

            grupService.save(grup);

            this.dispose();
        }
    }//GEN-LAST:event_btnOnaylaActionPerformed

    private void btnVazgecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVazgecActionPerformed
        int cıkısOnay = JOptionPane.showConfirmDialog(this, "İptal Etmek İstediğinizden Emim Misniz ?", "Onay", 2);
        if (cıkısOnay == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btnVazgecActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOnayla;
    private javax.swing.JButton btnVazgec;
    private javax.swing.JComboBox<String> cmbBaslangicAy;
    private javax.swing.JComboBox<String> cmbBaslangicGun;
    private javax.swing.JComboBox<String> cmbBaslangicYil;
    private javax.swing.JComboBox<String> cmbBitisAy;
    private javax.swing.JComboBox<String> cmbBitisGun;
    private javax.swing.JComboBox<String> cmbBitisYil;
    private javax.swing.JComboBox<String> cmbKurs;
    private javax.swing.JComboBox<String> cmbOgretmen;
    private javax.swing.JComboBox<String> cmbSalon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtGrupAdı;
    private javax.swing.JLabel txtGrupId;
    // End of variables declaration//GEN-END:variables

    private void combolariDoldur() {

        List<Kurs> kurs = kursService.getAll();
        cmbKurs.setModel(new DefaultComboBoxModel(kurs.toArray()));

        List<Ogretmen> ogretmen = ogretmenService.getAll();
        cmbOgretmen.setModel(new DefaultComboBoxModel(ogretmen.toArray()));

        List<Salon> salon = salonService.getAll();
        cmbSalon.setModel(new DefaultComboBoxModel(salon.toArray()));

        Integer baslangicGun[] = new Integer[31];
        Integer bitisGun[] = new Integer[31];
        Integer baslangicAy[] = new Integer[12];
        Integer bitisAy[] = new Integer[12];
        Integer baslangicYil[] = new Integer[84];
        Integer bitisYil[] = new Integer[84];

        for (int i = 1; i < 31; i++) {
            baslangicGun[i] = i;
            bitisGun[i] = i;
        }

        for (int i = 1; i < 12; i++) {
            baslangicAy[i] = i;
            bitisAy[i] = i;
        }

        for (int i = 2017; i < 2100; i++) {
            baslangicYil[i] = i;
            bitisYil[i] = i;
        }

        cmbBaslangicGun.setModel(new DefaultComboBoxModel(baslangicGun));

        cmbBaslangicGun.setModel(new DefaultComboBoxModel(baslangicAy));

        cmbBaslangicGun.setModel(new DefaultComboBoxModel(baslangicYil));

        cmbBaslangicGun.setModel(new DefaultComboBoxModel(bitisGun));

        cmbBaslangicGun.setModel(new DefaultComboBoxModel(bitisAy));

        cmbBaslangicGun.setModel(new DefaultComboBoxModel(bitisYil));
    }
}
