package com.temelt.coursemgmt.gui.yonetim;

import com.temelt.coursemgmt.model.yonetim.Grup;
import com.temelt.coursemgmt.service.yonetim.GrupService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmYonetimGrupIslemleri extends javax.swing.JDialog {

    GrupService grupService = new GrupService();
    public static String idSonuc;
    public static Long duzenleId;
    public static Long silId;

    public frmYonetimGrupIslemleri(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tabloDoldur();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGrup = new javax.swing.JTable();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        mnuEkle = new javax.swing.JMenuItem();
        mnuDuzenle = new javax.swing.JMenuItem();
        mnuSil = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        mnuOncekiMenu = new javax.swing.JMenuItem();
        mnuCikis = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

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

        jMenu5.setText("İşlemler");

        mnuEkle.setText("Yeni Grup Ekle");
        mnuEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEkleActionPerformed(evt);
            }
        });
        jMenu5.add(mnuEkle);

        mnuDuzenle.setText("Düzenle");
        mnuDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDuzenleActionPerformed(evt);
            }
        });
        jMenu5.add(mnuDuzenle);

        mnuSil.setText("Sil");
        mnuSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSilActionPerformed(evt);
            }
        });
        jMenu5.add(mnuSil);

        jMenuBar3.add(jMenu5);

        jMenu6.setText("Cıkış");

        mnuOncekiMenu.setText("Önceki Menü");
        mnuOncekiMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOncekiMenuActionPerformed(evt);
            }
        });
        jMenu6.add(mnuOncekiMenu);

        mnuCikis.setText("Çıkış");
        mnuCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCikisActionPerformed(evt);
            }
        });
        jMenu6.add(mnuCikis);

        jMenuBar3.add(jMenu6);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEkleActionPerformed
        frmYonetimGrupEkle yonetimGrupEkle = new frmYonetimGrupEkle(null, true);
        tabloDoldur();
    }//GEN-LAST:event_mnuEkleActionPerformed

    private void mnuDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDuzenleActionPerformed

        idSonuc = JOptionPane.showInputDialog("Düzenlemek İstediğiniz Grubun Id'sini Griniz.");
        if (idSonuc != null) {
            duzenleId = Long.parseLong(idSonuc);
            Grup grup = grupService.getById(duzenleId);
            if (grup != null) {
                frmYonetimGrupDuzenle yonetimGrupDuzenle = new frmYonetimGrupDuzenle(null, true);
                tabloDoldur();
            } else {
                JOptionPane.showMessageDialog(null, "Uyumsuz Id Girdiniz.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Uyumsuz Id Girdiniz.");
        }

    }//GEN-LAST:event_mnuDuzenleActionPerformed

    private void mnuSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSilActionPerformed
        idSonuc = JOptionPane.showInputDialog("Silmek İstediğiniz Grubun Id'sini Griniz.");
        if (idSonuc != null) {
            silId = Long.parseLong(idSonuc);
            Grup grup = grupService.getById(silId);
            if (grup != null) {
                grupService.delete(grup);
                tabloDoldur();
            } else {
                JOptionPane.showMessageDialog(null, "Uyumsuz Id Girdiniz.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Uyumsuz Id Girdiniz.");
        }
    }//GEN-LAST:event_mnuSilActionPerformed

    private void mnuOncekiMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOncekiMenuActionPerformed

        this.dispose();
        frmYonetim yonetim = new frmYonetim(null, true);

    }//GEN-LAST:event_mnuOncekiMenuActionPerformed

    private void mnuCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCikisActionPerformed

        int cıkısOnay = JOptionPane.showConfirmDialog(this, "Çıkmak İstediğinizden Emin Misiniz ?", "Çıkış", 2);
        if (cıkısOnay == 0) {
            System.exit(0);
        }

    }//GEN-LAST:event_mnuCikisActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnuCikis;
    private javax.swing.JMenuItem mnuDuzenle;
    private javax.swing.JMenuItem mnuEkle;
    private javax.swing.JMenuItem mnuOncekiMenu;
    private javax.swing.JMenuItem mnuSil;
    private javax.swing.JTable tblGrup;
    // End of variables declaration//GEN-END:variables

    private void tabloDoldur() {

        List<Grup> liste = grupService.getAll();
        String[][] data = new String[liste.size()][8];
        for (int i = 0; i < liste.size(); i++) {
            data[i][0] = liste.get(i).getId().toString();
            data[i][1] = liste.get(i).getAdi();
            data[i][2] = String.valueOf(liste.get(i).getOgrenciSayisi());
            data[i][3] = liste.get(i).getBaslamaTarihi().toString();
            data[i][4] = liste.get(i).getBitisTarihi().toString();
            if (liste.get(i).getKurs() != null) {
                data[i][5] = liste.get(i).getKurs().getAdi();
            }
            if (liste.get(i).getOgretmen() != null) {
                data[i][6] = liste.get(i).getOgretmen().getAd();
            }
            if (liste.get(i).getSalon() != null) {
                data[i][7] = liste.get(i).getSalon().getKod();
            }
        }
        tblGrup.setModel(new DefaultTableModel(data,
                new String[]{"Id", "Grup Adı", "Öğrenci Sayısı",
                    "Baslama Tarihi", "Bitiş Tarihi", "Kurs Adı", "Öğretmenin Adı", "Salon kodu"}));
    }

}
