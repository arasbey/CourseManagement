package com.temelt.coursemgmt.gui.yonetim;

import com.temelt.coursemgmt.model.yonetim.Kurs;
import com.temelt.coursemgmt.service.yonetim.KursService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmYonetimKursIslemleri extends javax.swing.JDialog {

    KursService kursService = new KursService();
    public static String ilkId;
    public static Long ikinciId;
    public static Long idSil;

    public frmYonetimKursIslemleri(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        tabloDoldur();
        this.show();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblGrup = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuYeniKursEkle = new javax.swing.JMenuItem();
        mnuDuzenle = new javax.swing.JMenuItem();
        mnuSil = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuOncekiMenu = new javax.swing.JMenuItem();
        mnuCikis = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblGrup.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblGrup);

        jMenu1.setText("İşlemler");

        mnuYeniKursEkle.setText("Yeni Kurs Ekle");
        mnuYeniKursEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuYeniKursEkleActionPerformed(evt);
            }
        });
        jMenu1.add(mnuYeniKursEkle);

        mnuDuzenle.setText("Düzenle");
        mnuDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDuzenleActionPerformed(evt);
            }
        });
        jMenu1.add(mnuDuzenle);

        mnuSil.setText("Sil");
        mnuSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSilActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSil);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Çıkış");

        mnuOncekiMenu.setText("Önceki Menü");
        mnuOncekiMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOncekiMenuActionPerformed(evt);
            }
        });
        jMenu2.add(mnuOncekiMenu);

        mnuCikis.setText("Çıkış");
        mnuCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCikisActionPerformed(evt);
            }
        });
        jMenu2.add(mnuCikis);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuOncekiMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOncekiMenuActionPerformed

        int cıkısOnay = JOptionPane.showConfirmDialog(this, "Çıkmak İstediğinizden Emin Misiniz ?", "Çıkış", 2);
        if (rootPaneCheckingEnabled) {
            System.exit(0);
        }

    }//GEN-LAST:event_mnuOncekiMenuActionPerformed

    private void mnuCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCikisActionPerformed

        this.dispose();
        frmYonetim yonetim = new frmYonetim(null, true);

    }//GEN-LAST:event_mnuCikisActionPerformed

    private void mnuYeniKursEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuYeniKursEkleActionPerformed

        frmYonetimKursEkle yonetimKursEkle = new frmYonetimKursEkle(null, true);

    }//GEN-LAST:event_mnuYeniKursEkleActionPerformed

    private void mnuDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDuzenleActionPerformed

        ilkId = JOptionPane.showInputDialog("Düzenlemek İstediğiniz Grubun Id'sini Griniz.");
        if (ilkId != null) {
            ikinciId = Long.parseLong(ilkId);
            Kurs kurs = kursService.getById(ikinciId);
            if (kurs != null) {
                frmYonetimKursDuzenle yonetimKursDuzenle = new frmYonetimKursDuzenle(null, true);
                tabloDoldur();
            } else {
                JOptionPane.showMessageDialog(null, "Uyumsuz Id Girdiniz.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Uyumsuz Id Girdiniz.");
        }

    }//GEN-LAST:event_mnuDuzenleActionPerformed

    private void mnuSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSilActionPerformed

        String silinecekId = JOptionPane.showInputDialog("Düzenlemek İstediğiniz Grubun Id'sini Griniz.");
        if (silinecekId != null) {
            Long ikincilId = Long.parseLong(silinecekId);
            Kurs kurs = kursService.getById(ikincilId);
            if (kurs != null) {
                kursService.delete(kurs);
                tabloDoldur();
            } else {
                JOptionPane.showMessageDialog(null, "Uyumsuz Id Girdiniz.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Uyumsuz Id Girdiniz.");
        }

    }//GEN-LAST:event_mnuSilActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnuCikis;
    private javax.swing.JMenuItem mnuDuzenle;
    private javax.swing.JMenuItem mnuOncekiMenu;
    private javax.swing.JMenuItem mnuSil;
    private javax.swing.JMenuItem mnuYeniKursEkle;
    private javax.swing.JTable tblGrup;
    // End of variables declaration//GEN-END:variables

    private void tabloDoldur() {
        List<Kurs> liste = kursService.getAll();
        String[][] data = new String[liste.size()][4];
        for (int i = 0; i < liste.size(); i++) {
            data[i][0] = liste.get(i).getId().toString();
            data[i][1] = liste.get(i).getAdi();
            data[i][3] = liste.get(i).getbaslamaTarihi().toString();
            data[i][4] = liste.get(i).getFiyat().toString();
        }
        tblGrup.setModel(new DefaultTableModel(data,
                new String[]{"Id", "Kurs Adı", "Başlama Tarihi",
                    "Fiyatı"}));
    }

}
