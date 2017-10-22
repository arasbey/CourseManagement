package com.temelt.coursemgmt.gui.yonetim;

import com.temelt.coursemgmt.model.yonetim.GrupGun;
import com.temelt.coursemgmt.model.yonetim.Gun;
import com.temelt.coursemgmt.service.yonetim.GrupGunService;
import javax.swing.JOptionPane;

public class frmYonetimGrupGunuDuzenleme extends javax.swing.JDialog {

    GrupGunService grupGunService = new GrupGunService();
    public static GrupGun grupGun;

    public frmYonetimGrupGunuDuzenleme(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        DuzenlencekGrupGun(frmYonetimGrupGunIslemleri.duzenlenmisId);
        this.show();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVazgec = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        btnOnayla1 = new javax.swing.JButton();
        btnVazgec1 = new javax.swing.JButton();
        txtGrupGunID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxPazartesi = new javax.swing.JCheckBox();
        cbxCarsamba = new javax.swing.JCheckBox();
        cbxPersembe = new javax.swing.JCheckBox();
        cbxSali = new javax.swing.JCheckBox();
        cbxCuma = new javax.swing.JCheckBox();
        cbxCumartesi = new javax.swing.JCheckBox();
        cbxPazar = new javax.swing.JCheckBox();
        txtGrupAdi = new javax.swing.JLabel();

        btnVazgec.setText("Vazgeç");
        btnVazgec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVazgecActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnOnayla1.setText("ONAYLA");
        btnOnayla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnayla1ActionPerformed(evt);
            }
        });

        btnVazgec1.setText("VAZGEÇ");
        btnVazgec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVazgec1ActionPerformed(evt);
            }
        });

        txtGrupGunID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtGrupGunID.setText("Grup Gun Id :   ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Grup Gunu Seciniz : ");

        cbxPazartesi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxPazartesi.setText("Pazartesi");

        cbxCarsamba.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxCarsamba.setText("Çarşamba");

        cbxPersembe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxPersembe.setText("Perşembe");

        cbxSali.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxSali.setText("Salı");

        cbxCuma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxCuma.setText("Cuma");

        cbxCumartesi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxCumartesi.setText("Cumartesi");

        cbxPazar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxPazar.setText("Pazar");

        txtGrupAdi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtGrupAdi.setText("Grup Adı :   ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVazgec1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOnayla1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(cbxCuma)
                            .addGap(18, 18, 18)
                            .addComponent(cbxCumartesi)
                            .addGap(18, 18, 18)
                            .addComponent(cbxPazar))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cbxPazartesi)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbxSali))
                                .addComponent(jLabel2)
                                .addComponent(txtGrupGunID)
                                .addComponent(txtGrupAdi))
                            .addGap(31, 31, 31)
                            .addComponent(cbxCarsamba)
                            .addGap(18, 18, 18)
                            .addComponent(cbxPersembe))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtGrupGunID)
                .addGap(18, 18, 18)
                .addComponent(txtGrupAdi)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxPazartesi)
                    .addComponent(cbxCarsamba)
                    .addComponent(cbxSali)
                    .addComponent(cbxPersembe))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxCuma)
                    .addComponent(cbxPazar)
                    .addComponent(cbxCumartesi))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVazgec1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOnayla1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVazgecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVazgecActionPerformed
        int cıkısOnay = JOptionPane.showConfirmDialog(this, "İptal Etmek İstediğinizden Emim Misniz ?", "Onay", 2);
        if (cıkısOnay == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btnVazgecActionPerformed

    private void DuzenlencekGrupGun(Long id) {

        grupGun = grupGunService.getById(id);
        txtGrupGunID.setText("Grup Gun ID :   " + grupGun.getId());
        txtGrupAdi.setText("Grup Adı :  " + grupGun.getGrup().getAdi());
    }


    private void btnOnayla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnayla1ActionPerformed

        Gun gun = new Gun();
        int pazartesi = 0;
        int sali = 0;
        int carsamba = 0;
        int persembe = 0;
        int cuma = 0;
        int cumartesi = 0;
        int pazar = 0;

        if (cbxPazartesi.isSelected()) {
            pazartesi = 1;
        }
        if (cbxSali.isSelected()) {
            sali = 1;
        }
        if (cbxCarsamba.isSelected()) {
            carsamba = 1;
        }
        if (cbxPersembe.isSelected()) {
            persembe = 1;
        }
        if (cbxCuma.isSelected()) {
            cuma = 1;
        }
        if (cbxCumartesi.isSelected()) {
            cumartesi = 1;
        }
        if (cbxPazar.isSelected()) {
            pazar = 1;
        }
        gun.setGun1(pazartesi);
        gun.setGun2(sali);
        gun.setGun3(carsamba);
        gun.setGun4(persembe);
        gun.setGun5(cuma);
        gun.setGun6(cumartesi);
        gun.setGun7(pazar);
        grupGun.setGun(gun);

    }//GEN-LAST:event_btnOnayla1ActionPerformed

    private void btnVazgec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVazgec1ActionPerformed

        int cıkısOnay = JOptionPane.showConfirmDialog(this, "İptal Etmek İstediğinizden Emim Misniz ?", "Onay", 2);
        if (cıkısOnay == 0) {
            this.dispose();
        }

    }//GEN-LAST:event_btnVazgec1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOnayla1;
    private javax.swing.JButton btnVazgec;
    private javax.swing.JButton btnVazgec1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox cbxCarsamba;
    private javax.swing.JCheckBox cbxCuma;
    private javax.swing.JCheckBox cbxCumartesi;
    private javax.swing.JCheckBox cbxPazar;
    private javax.swing.JCheckBox cbxPazartesi;
    private javax.swing.JCheckBox cbxPersembe;
    private javax.swing.JCheckBox cbxSali;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel txtGrupAdi;
    private javax.swing.JLabel txtGrupGunID;
    // End of variables declaration//GEN-END:variables

}
