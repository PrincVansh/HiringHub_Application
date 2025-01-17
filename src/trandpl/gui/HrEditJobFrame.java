/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.gui;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import trandpl.dao.HrDAO;
import trandpl.dao.JobDAO;
import trandpl.pojo.CurrentUser;
import trandpl.pojo.JobPojo;

/**
 *
 * @author hmayw
 */
public class HrEditJobFrame extends javax.swing.JFrame {

    private JobPojo job;
    public HrEditJobFrame() {
        initComponents();
        setLocationRelativeTo(null);
        lblHrName.setText(CurrentUser.getName());
        
    }
    public HrEditJobFrame(JobPojo obj)
    {
        this();
        this.job=obj;
        loadData();
    }
    private void loadData()
    {
       lblJobId.setText(job.getJobId());
       txtJobTitle.setText(job.getJobTitle());
       String [] tags=job.getTags().split(",");
       txtSkill1.setText(tags[0]);
       txtSkill2.setText(tags[1]);
       txtSkill3.setText(tags[2]);
       txtSkill4.setText(tags[3]);
       try{
           txtCompanyName.setText(HrDAO.getCompanyNameById(CurrentUser.getId()));
       }
       catch(SQLException ex)
       {
           JOptionPane.showMessageDialog(null,"Error in fetching company Name ","DB Error ",JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
       }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblHrName = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnSaveChanges = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        lblJobId = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtSkill3 = new javax.swing.JTextField();
        txtSkill4 = new javax.swing.JTextField();
        txtCompanyName = new javax.swing.JTextField();
        txtJobTitle = new javax.swing.JTextField();
        txtSkill2 = new javax.swing.JTextField();
        txtSkill1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 980, 208));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel3.setText("Welcome ,");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        lblHrName.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jPanel1.add(lblHrName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 210, 30));

        jButton1.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(867, 690, 100, -1));

        btnSaveChanges.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        btnSaveChanges.setText("Save Changes");
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaveChanges, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 690, 260, -1));

        jButton3.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 690, 100, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 960, 10));

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel4.setText("Job Id : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        lblJobId.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jPanel1.add(lblJobId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 140, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 730, 10));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/JobPng.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, 290, 310));

        jLabel7.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel7.setText("Job title");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel8.setText("Company Name ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, -1, -1));

        jLabel9.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel9.setText("Skill Required");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 730, 10));

        txtSkill3.setBackground(new java.awt.Color(173, 192, 234));
        txtSkill3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtSkill3.setBorder(null);
        jPanel1.add(txtSkill3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, 250, 30));

        txtSkill4.setBackground(new java.awt.Color(173, 192, 234));
        txtSkill4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtSkill4.setBorder(null);
        jPanel1.add(txtSkill4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 600, 250, 30));

        txtCompanyName.setEditable(false);
        txtCompanyName.setBackground(new java.awt.Color(173, 192, 234));
        txtCompanyName.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtCompanyName.setBorder(null);
        jPanel1.add(txtCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 300, 30));

        txtJobTitle.setBackground(new java.awt.Color(173, 192, 234));
        txtJobTitle.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtJobTitle.setBorder(null);
        jPanel1.add(txtJobTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 300, 30));

        txtSkill2.setBackground(new java.awt.Color(173, 192, 234));
        txtSkill2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtSkill2.setBorder(null);
        jPanel1.add(txtSkill2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, 250, 30));

        txtSkill1.setBackground(new java.awt.Color(173, 192, 234));
        txtSkill1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtSkill1.setBorder(null);
        jPanel1.add(txtSkill1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 250, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tg_image_915734271.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, -1, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tg_image_915734271.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 590, -1, 50));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tg_image_915734271.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, 50));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tg_image_915734271.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, -1, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TIT/logo-only (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1025, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 731, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new LoginScreenFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
       boolean result=validateInputs();
       if(result==false)
       {
           JOptionPane.showMessageDialog(null,"Fields Sholud not be left blank","Alert !",JOptionPane.ERROR_MESSAGE);
           return ;
       }
       JobPojo obj=new JobPojo();
        obj.setJobId(lblJobId.getText());
        obj.setJobTitle(txtJobTitle.getText());
        obj.setTags(txtSkill1.getText().trim()+","+txtSkill2.getText().trim()+","+txtSkill3.getText().trim()+","+txtSkill4.getText().trim());
        try{
            result =JobDAO.modifyJob(obj);
            if(result)
            {
                JOptionPane.showMessageDialog(null,"Record Modified","Success !",JOptionPane.INFORMATION_MESSAGE);
                return ;  
            }
              JOptionPane.showMessageDialog(null,"Reacord could not be modified","Alert !",JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException ex)
        {
           JOptionPane.showMessageDialog(null,"Error while modifying data","DB Error ",JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace(); 
        }
    }//GEN-LAST:event_btnSaveChangesActionPerformed
     private boolean validateInputs()
     {
         if(txtJobTitle.getText().isEmpty()||txtSkill1.getText().isEmpty()||txtSkill2.getText().isEmpty()||txtSkill3.getText().isEmpty()||txtSkill4.getText().isEmpty())
             return false;
         else
             return true;
     }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new HrChooseJobForEditingFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(HrEditJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HrEditJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HrEditJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HrEditJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HrEditJobFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblHrName;
    private javax.swing.JLabel lblJobId;
    private javax.swing.JTextField txtCompanyName;
    private javax.swing.JTextField txtJobTitle;
    private javax.swing.JTextField txtSkill1;
    private javax.swing.JTextField txtSkill2;
    private javax.swing.JTextField txtSkill3;
    private javax.swing.JTextField txtSkill4;
    // End of variables declaration//GEN-END:variables
}
