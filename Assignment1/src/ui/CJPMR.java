/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import dao.MRDao;
import javax.swing.JOptionPane;
import pojo.MR;

/**
 *
 * @author victor
 */
public class CJPMR extends javax.swing.JPanel {
    MRDao mrDao;
    /**
     * Creates new form CJPMR
     */
    public CJPMR(MRDao mrdao) {
        initComponents();
        this.mrDao = mrdao;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMRN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtA1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtA2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtA3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();

        txtMRN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMRNActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Mshtakan", 1, 24)); // NOI18N
        jLabel6.setText("User Information System - Medical Record");

        txtA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtA1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Medical Record Number:");

        txtA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtA2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Alergy1:");

        txtA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtA3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Alergy2:");

        jLabel5.setText("Alergy3:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(262, 262, 262))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(88, 88, 88))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtA3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                    .addComponent(txtA2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtA1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMRN, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(txtMRN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125)
                .addComponent(btnSave)
                .addContainerGap(161, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMRNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMRNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMRNActionPerformed

    private void txtA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtA1ActionPerformed

    private void txtA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtA2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtA2ActionPerformed

    private void txtA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtA3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtA3ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        int MRNuber = 0;
        String ag1="";
        String ag2="";
        String ag3="";
     try{
        MRNuber = Integer.parseInt(txtMRN.getText());
        ag1 = txtA1.getText();
        ag2 = txtA2.getText();
        ag3 = txtA3.getText();
     }catch(Exception e){
         JOptionPane.showMessageDialog(this,"Please check the input format","",JOptionPane.WARNING_MESSAGE);
     }
      
     
        MR mr = mrDao.addMR();
        
        mr.setMRNumber(MRNuber);
        mr.setAg1(ag1);
        mr.setAg2(ag2);
        mr.setAg3(ag3);
       
      
        JOptionPane.showMessageDialog(this,"Add Succeed!");
        
      
        txtMRN.setText("");
        txtA1.setText("");
        txtA2.setText("");
        txtA3.setText("");
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtA1;
    private javax.swing.JTextField txtA2;
    private javax.swing.JTextField txtA3;
    private javax.swing.JTextField txtMRN;
    // End of variables declaration//GEN-END:variables
}