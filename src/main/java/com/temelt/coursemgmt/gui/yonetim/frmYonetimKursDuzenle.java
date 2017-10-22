package com.temelt.coursemgmt.gui.yonetim;

import com.temelt.coursemgmt.model.yonetim.Kurs;
import com.temelt.coursemgmt.service.yonetim.KursService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class frmYonetimKursDuzenle extends javax.swing.JDialog {

    KursService kursService = new KursService();
    
    
    public frmYonetimKursDuzenle(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        DuzenlecekKurs(frmYonetimKursIslemleri.ikinciId);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbBaslangicYil = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnOnayla = new javax.swing.JButton();
        txtGrupAdı = new javax.swing.JTextField();
        btnVazgec = new javax.swing.JButton();
        cmbBaslangicGun = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cmbBaslangicAy = new javax.swing.JComboBox<>();
        txtKursId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Kurs Adı :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Başlama Tarihi :");

        cmbBaslangicYil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setText("Gün :");

        jLabel12.setText("Ay :");

        jLabel13.setText("Yıl :");

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

        cmbBaslangicGun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Fiyatını Giriniz :");

        cmbBaslangicAy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtKursId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtKursId.setText("Kurs Id :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKursId)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtGrupAdı, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField1)
                                        .addGap(1, 1, 1))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbBaslangicGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbBaslangicAy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbBaslangicYil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnVazgec, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(202, 202, 202)
                            .addComponent(btnOnayla, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txtKursId)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtGrupAdı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(cmbBaslangicGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBaslangicAy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBaslangicYil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOnayla, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVazgec, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DuzenlecekKurs(Long id){
    
//    Date bugun = new Date();
//        Kurs kurs = kursService.getById(id);
//        Calendar calendar = Calendar.getInstance();
//
//        if (grup.getBaslamaTarihi().before(bugun)) {
//            tarihOnay = 1;
//        }
//
//        calendar.setTime(grup.getBaslamaTarihi());
//        int baslamaYil = calendar.get(Calendar.YEAR);
//        int baslamaAy = calendar.get(Calendar.MONTH);
//        int baslamaGun = calendar.get(Calendar.DAY_OF_MONTH);
//
//        cmbBaslangicGun.setSelectedIndex(baslamaGun - 1);
//        cmbBaslangicAy.setSelectedIndex(baslamaAy - 1);
//        cmbBaslangicYil.setSelectedIndex(baslamaYil - 1);
//
//        txtKursId.setText("Grup ID : " + kurs.getId().toString());
//        txtGrupAdı.setText(kurs.getAdi());
//        cmbKurs.setSelectedItem(grup.getKurs().getAdi());
//        cmbOgretmen.setSelectedItem(grup.getOgretmen().getAd());
//        cmbSalon.setSelectedItem(grup.getSalon().getKod());
//    
    }
    
    private void btnOnaylaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnaylaActionPerformed

        KursService grupService = new KursService();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Kurs kurs = new Kurs();
        Date bugun = new Date();
        int baslamaGun = cmbBaslangicGun.getSelectedIndex() + 1;
        int baslamaAy = cmbBaslangicAy.getSelectedIndex() + 1;
        int baslamaYil = cmbBaslangicGun.getSelectedIndex() + 1;

        int onay = 0;
        int ikincilOnay = 1;
        try {
            Date baslamaTarihi = simpleDateFormat.parse(baslamaGun + "." + baslamaAy + "." + baslamaYil);
            if (baslamaTarihi.after(bugun)) {
                kurs.setbaslamaTarihi(baslamaTarihi);
                onay = 1;
            } else {
                ikincilOnay = JOptionPane.showConfirmDialog(this, "Uyumusuz Tarih ! Tarih Kaydı Olmadan GruP kaydedilsin mi ?", "Hata", 2);
            }

        } catch (ParseException ex) {
            Logger.getLogger(frmYonetimGrupEkle.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (onay == 1 || ikincilOnay == 0) {
            kurs.setAdi(txtGrupAdı.getText());
            grupService.save(kurs);

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtGrupAdı;
    private javax.swing.JLabel txtKursId;
    // End of variables declaration//GEN-END:variables

    private void combolariDoldur() {

        Integer baslangicGun[] = new Integer[31];
        Integer baslangicAy[] = new Integer[12];
        Integer baslangicYil[] = new Integer[84];

        for (int i = 1; i < 31; i++) {
            baslangicGun[i] = i;
        }

        for (int i = 1; i < 12; i++) {
            baslangicAy[i] = i;
        }

        for (int i = 2017; i < 2100; i++) {
            baslangicYil[i] = i;
        }

        cmbBaslangicGun.setModel(new DefaultComboBoxModel(baslangicGun));

        cmbBaslangicGun.setModel(new DefaultComboBoxModel(baslangicAy));

        cmbBaslangicGun.setModel(new DefaultComboBoxModel(baslangicYil));

    }

}
