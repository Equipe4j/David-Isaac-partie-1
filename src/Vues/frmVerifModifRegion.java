/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import static Vues.frmVerifMofidVisiteur.nom;

/**
 *
 * @author PC
 */
public class frmVerifModifRegion extends javax.swing.JFrame {

    /**
     * Creates new form frmVerifModifRegion
     */
    public frmVerifModifRegion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboReg = new javax.swing.JComboBox<>();
        btnChercher = new javax.swing.JButton();
        cboRegion = new javax.swing.JComboBox<>();
        cboVisiteur = new javax.swing.JComboBox<>();
        btnAnnuler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("Modifier une Région");

        jLabel2.setText("Région");

        btnChercher.setText("Chercher");
        btnChercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChercherActionPerformed(evt);
            }
        });

        cboRegion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Région", "lister", "ajouter", "modifier", " " }));
        cboRegion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboRegionMouseClicked(evt);
            }
        });

        cboVisiteur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Visiteur", "lister", "ajouter", "modifier", " " }));
        cboVisiteur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboVisiteurMouseClicked(evt);
            }
        });

        btnAnnuler.setText("Annuler");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnChercher))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboReg, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cboRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChercher)
                    .addComponent(btnAnnuler))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChercherActionPerformed
        // TODO add your handling code here:
        frmModifRegion frm = new frmModifRegion();
        frm.setVisible(true);
    }//GEN-LAST:event_btnChercherActionPerformed

    private void cboVisiteurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboVisiteurMouseClicked
        // TODO add your handling code here:
        if(cboVisiteur.getSelectedItem().toString().compareTo("Visiteur") ==0){
            frmVisiteur frm = new frmVisiteur();
            frm.setVisible(true);
            this.dispose();
        }
        
            if(cboVisiteur.getSelectedItem().toString().compareTo("lister") ==0){
                frmVisiteur frm = new frmVisiteur();
                frm.setVisible(true);
                 this.dispose();
            }
           
                if(cboVisiteur.getSelectedItem().toString().compareTo("ajouter") ==0){
                    frmAjoutVisteur frm = new frmAjoutVisteur();
                    frm.setVisible(true);
                    this.dispose();
                }
                
                    if(cboVisiteur.getSelectedItem().toString().compareTo("modifier") ==0){
                        frmVerifMofidVisiteur frm = new frmVerifMofidVisiteur(nom);
                        frm.setVisible(true);
                        this.dispose();
                    }
    }//GEN-LAST:event_cboVisiteurMouseClicked

    private void cboRegionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboRegionMouseClicked
        // TODO add your handling code here:
        
        if(cboRegion.getSelectedItem().toString().compareTo("Région") ==0){
            frmRegion frm = new frmRegion();
            frm.setVisible(true);
            this.dispose();
        }
        
            if(cboRegion.getSelectedItem().toString().compareTo("lister") ==0){
                frmRegion frm = new frmRegion();
                frm.setVisible(true);
                 this.dispose();
            }
           
                if(cboRegion.getSelectedItem().toString().compareTo("ajouter") ==0){
                    frmAjoutRegion frm = new frmAjoutRegion();
                    frm.setVisible(true);
                    this.dispose();
                }
                
                    if(cboRegion.getSelectedItem().toString().compareTo("modifier") ==0){
                        frmVerifModifRegion frm = new frmVerifModifRegion();
                        frm.setVisible(true);
                        this.dispose();
                    }
    }//GEN-LAST:event_cboRegionMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmVerifModifRegion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVerifModifRegion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVerifModifRegion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVerifModifRegion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVerifModifRegion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnChercher;
    private javax.swing.JComboBox<String> cboReg;
    private javax.swing.JComboBox<String> cboRegion;
    private javax.swing.JComboBox<String> cboVisiteur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}