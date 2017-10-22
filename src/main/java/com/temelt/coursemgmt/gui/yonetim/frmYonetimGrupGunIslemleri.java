package com.temelt.coursemgmt.gui.yonetim;

import com.temelt.coursemgmt.model.yonetim.GrupGun;
import com.temelt.coursemgmt.service.yonetim.GrupGunService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmYonetimGrupGunIslemleri extends javax.swing.JDialog {

    GrupGunService grupGunService = new GrupGunService();
    public static String idSonucu;
    public static Long duzenlenmisId;

    public frmYonetimGrupGunIslemleri(java.awt.Frame parent, boolean modal) {
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
        tblGrupGun = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuGrupGunuDuzenle = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuOncekiMenu = new javax.swing.JMenuItem();
        mnuCikis = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblGrupGun.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblGrupGun);

        jMenu1.setText("İşlemler");

        mnuGrupGunuDuzenle.setText("Grup Günü Düzenle");
        mnuGrupGunuDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGrupGunuDuzenleActionPerformed(evt);
            }
        });
        jMenu1.add(mnuGrupGunuDuzenle);

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuGrupGunuDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGrupGunuDuzenleActionPerformed

        idSonucu = JOptionPane.showInputDialog("Düzenlemek İstediğiniz Grubun Id'sini Griniz.");
        if (idSonucu != null) {
            duzenlenmisId = Long.parseLong(idSonucu);
            GrupGun grupGun = grupGunService.getById(duzenlenmisId);
            if (grupGun != null) {
                frmYonetimGrupGunuDuzenleme yonetimGrupGunuDuzenleme = new frmYonetimGrupGunuDuzenleme(null, true);
                tabloDoldur();
            } else {
                JOptionPane.showMessageDialog(null, "Uyumsuz Id Girdiniz.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Uyumsuz Id Girdiniz.");
        }
        frmYonetimGrupGunuDuzenleme yonetimGrupGunuDuzenleme = new frmYonetimGrupGunuDuzenleme(null, true);

    }//GEN-LAST:event_mnuGrupGunuDuzenleActionPerformed

    private void mnuOncekiMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOncekiMenuActionPerformed
        this.dispose();
        frmYonetim yonetim = new frmYonetim(null, true);
    }//GEN-LAST:event_mnuOncekiMenuActionPerformed

    private void mnuCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCikisActionPerformed
        int cıkısOnay = JOptionPane.showConfirmDialog(this, "Çıkmak İstediğinizden Emin Misiniz ?", "Çıkış", 2);
        if (rootPaneCheckingEnabled) {
            System.exit(0);
        }
    }//GEN-LAST:event_mnuCikisActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnuCikis;
    private javax.swing.JMenuItem mnuGrupGunuDuzenle;
    private javax.swing.JMenuItem mnuOncekiMenu;
    private javax.swing.JTable tblGrupGun;
    // End of variables declaration//GEN-END:variables

    private void tabloDoldur() {

        List<GrupGun> liste = grupGunService.getAll();
        String[][] data = new String[liste.size()][4];
        Integer[][] gunler = new Integer[liste.size()][7];
        String[][] gunler2 = new String[liste.size()][7];
        String[] gunler3 = new String[liste.size()];

        for (int i = 0; i < liste.size(); i++) {
            data[i][0] = liste.get(i).getId().toString();

            if (liste.get(i).getGrup() != null) {
                data[i][1] = liste.get(i).getGrup().getAdi();
            }
            if (liste.get(i).getGun() != null) {
                gunler[i][1] = liste.get(i).getGun().getGun1();
                gunler[i][2] = liste.get(i).getGun().getGun2();
                gunler[i][3] = liste.get(i).getGun().getGun3();
                gunler[i][4] = liste.get(i).getGun().getGun4();
                gunler[i][5] = liste.get(i).getGun().getGun5();
                gunler[i][6] = liste.get(i).getGun().getGun6();
                gunler[i][7] = liste.get(i).getGun().getGun7();
                for (int j = 0; j < gunler.length; j++) {
                    String gun = "";
                    if (gunler[i][1] == 1) {
                        gunler2[j][1] = "Pazartesi";
                        gun = "Pazartesi";
                    }
                    if (gunler[i][2] == 1) {
                        gunler2[j][2] = "Salı";
                        gun = gun + ", " + "Salı";
                    }
                    if (gunler[i][3] == 1) {
                        gunler2[j][3] = "Çarşamba";
                        gun = gun + ", " + "Çarşamba";
                    }
                    if (gunler[i][4] == 1) {
                        gunler2[j][4] = "Perşembe";
                        gun = gun + ", " + "Perşembe";
                    }
                    if (gunler[i][5] == 1) {
                        gunler2[j][5] = "Cuma";
                        gun = gun + ", " + "Cuma";
                    }
                    if (gunler[i][6] == 1) {
                        gunler2[j][6] = "Cumartesi";
                        gun = gun + ", " + "Cumartesi";
                    }
                    if (gunler[i][7] == 1) {
                        gunler2[j][7] = "Pazar";
                        gun = gun + ", " + "Pazar";
                    }
                    gunler3[i] = gun;
                }
            }
        }
        for (int i = 0; i < liste.size(); i++) {
            data[i][3] = gunler3[i];

        }
        tblGrupGun.setModel(new DefaultTableModel(data,
                new String[]{"Id", "Grup Adı", "Ders Günleri"}));
    }

}
