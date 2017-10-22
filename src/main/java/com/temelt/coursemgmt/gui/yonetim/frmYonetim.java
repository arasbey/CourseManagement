package com.temelt.coursemgmt.gui.yonetim;

import com.temelt.coursemgmt.gui.frmAnaSayfa;
import javax.swing.JOptionPane;

public class frmYonetim extends javax.swing.JDialog {

    public frmYonetim(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupIslem = new javax.swing.JButton();
        btnKursIslem = new javax.swing.JButton();
        btnGrupGunIslem = new javax.swing.JButton();
        btnSalonIslem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCikis = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnGrupIslem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGrupIslem.setText("Grup İşlemleri");
        btnGrupIslem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrupIslemActionPerformed(evt);
            }
        });

        btnKursIslem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnKursIslem.setText("Kurs İşlemleri");
        btnKursIslem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKursIslemActionPerformed(evt);
            }
        });

        btnGrupGunIslem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGrupGunIslem.setText("Grup Gün İşlemleri");
        btnGrupGunIslem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrupGunIslemActionPerformed(evt);
            }
        });

        btnSalonIslem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalonIslem.setText("Salon İşlemleri");
        btnSalonIslem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalonIslemActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("YONETİM  İŞLEMLERİ");

        btnCikis.setText("Geri Don");
        btnCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCikisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCikis))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGrupIslem, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGrupGunIslem))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnKursIslem, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(btnSalonIslem, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGrupIslem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGrupGunIslem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalonIslem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKursIslem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnCikis)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKursIslemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKursIslemActionPerformed

        frmYonetimKursIslemleri yonetimKursIslemleri = new frmYonetimKursIslemleri(null, true);
        this.dispose();
        yonetimKursIslemleri.show();

    }//GEN-LAST:event_btnKursIslemActionPerformed

    private void btnGrupIslemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrupIslemActionPerformed

        frmYonetimGrupIslemleri yonetimGrupIslemleri = new frmYonetimGrupIslemleri(null, true);
        this.dispose();
        yonetimGrupIslemleri.show();

    }//GEN-LAST:event_btnGrupIslemActionPerformed

    private void btnGrupGunIslemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrupGunIslemActionPerformed

        frmYonetimGrupGunIslemleri yonetimGrupGunIslemleri = new frmYonetimGrupGunIslemleri(null, true);
        this.dispose();
        yonetimGrupGunIslemleri.show();

    }//GEN-LAST:event_btnGrupGunIslemActionPerformed

    private void btnSalonIslemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalonIslemActionPerformed

        frmYonetimSalonIslemleri yonetimSalonIslemleri = new frmYonetimSalonIslemleri(null, true);
        this.dispose();
        yonetimSalonIslemleri.show();

    }//GEN-LAST:event_btnSalonIslemActionPerformed

    private void btnCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCikisActionPerformed

        int Sonuc = JOptionPane.showConfirmDialog(this, "Önceki Menüye Dönülsün mü ?", "Çıkış Onay", 2);
        if (Sonuc == 0) {
            this.dispose();
        }

    }//GEN-LAST:event_btnCikisActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCikis;
    private javax.swing.JButton btnGrupGunIslem;
    private javax.swing.JButton btnGrupIslem;
    private javax.swing.JButton btnKursIslem;
    private javax.swing.JButton btnSalonIslem;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
