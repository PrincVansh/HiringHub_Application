/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.gui;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import trandpl.dao.UsersDAO;
import trandpl.pojo.CurrentUser;
import trandpl.pojo.UsersPojo;

/**
 *
 * @author hmayw
 */
public class LoginScreenFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginScreenFrame
     */
    public LoginScreenFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtMail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rbtnAdmin = new javax.swing.JRadioButton();
        rbtnCompanyHR = new javax.swing.JRadioButton();
        rbtnStudent = new javax.swing.JRadioButton();
        btnLogin = new javax.swing.JButton();
        btnSignup = new javax.swing.JButton();
        txtPwd = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMail.setBackground(new java.awt.Color(173, 192, 234));
        txtMail.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtMail.setBorder(null);
        txtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailActionPerformed(evt);
            }
        });
        jPanel1.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 410, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TIT/logo-only (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 80));

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel2.setText("Email or user id :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 180, 344, 39));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tg_image_4018958162.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 225, 450, -1));

        buttonGroup1.add(rbtnAdmin);
        rbtnAdmin.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        rbtnAdmin.setText("Admin");
        rbtnAdmin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select User Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 0, 18))); // NOI18N
        jPanel1.add(rbtnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 454, 128, -1));

        buttonGroup1.add(rbtnCompanyHR);
        rbtnCompanyHR.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        rbtnCompanyHR.setText("Company HR");
        rbtnCompanyHR.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select User Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 0, 18))); // NOI18N
        jPanel1.add(rbtnCompanyHR, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 454, 161, -1));

        buttonGroup1.add(rbtnStudent);
        rbtnStudent.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        rbtnStudent.setText("Student");
        rbtnStudent.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select User Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 0, 18))); // NOI18N
        jPanel1.add(rbtnStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 454, 120, -1));

        btnLogin.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        btnLogin.setText("Log In");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 577, 105, -1));

        btnSignup.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        btnSignup.setText("Sign Up");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 577, 99, -1));

        txtPwd.setBackground(new java.awt.Color(173, 192, 234));
        txtPwd.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtPwd.setBorder(null);
        jPanel1.add(txtPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 410, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tg_image_4018958162.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 309, 450, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homePage.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 590, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 505, 443, 14));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 399, 443, 19));

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        jLabel6.setText("Select User Type : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 424, -1, -1));

        jLabel7.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel7.setText("Password : ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 287, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
      boolean valid=validateInput();
        if(valid==false)
        {
            JOptionPane.showMessageDialog(null,"Fields should not be left blank","Error Message",JOptionPane.ERROR_MESSAGE);
            return ;
        }
        String mail=txtMail.getText();
        String pwd=String.valueOf(txtPwd.getPassword());
        
       
        String usrType=varifyUser();
        
        if(usrType==null)
        {
            JOptionPane.showMessageDialog(null,"Please select a user type","Error Message",JOptionPane.ERROR_MESSAGE);
            return;
        }
       UsersPojo usr=new UsersPojo();
    
       usr.setUserId(mail.toUpperCase());
       usr.setPassword(pwd);
       usr.setType(usrType);
       
       try{
           boolean result=UsersDAO.validateUser(usr);
            if(result==true)
            {
               if(CurrentUser.getType().equals("Admin"))
               {
                    JOptionPane.showMessageDialog(this,"Welocome Admin "+CurrentUser.getName(),"Greeting",JOptionPane.INFORMATION_MESSAGE);
                    new AdminOptionsFrame().setVisible(true);
                    this.dispose();
               }
               else if(CurrentUser.getType().equals("Hr"))
               {
                    JOptionPane.showMessageDialog(this,"Welocome Hr, "+CurrentUser.getName(),"Greeting",JOptionPane.INFORMATION_MESSAGE);
                    new HrOptionFrame().setVisible(true);
                    this.dispose();
               }
               else{
                     JOptionPane.showMessageDialog(this,"Welocome Student , "+CurrentUser.getName(),"Greeting",JOptionPane.INFORMATION_MESSAGE);
                    new StudentOptionFrame().setVisible(true);
                    this.dispose(); 
               }
            }
          else
           {
             JOptionPane.showMessageDialog(this,"Invalid userid,password or type","Error",JOptionPane.ERROR_MESSAGE);  
           }
       
       }
       catch(SQLException ex)
       {
           JOptionPane.showMessageDialog(this,"Error in DB","Error",JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
       }
      
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
      new SignUpFrame().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnSignupActionPerformed
     private boolean validateInput()
     {
         if(txtMail.getText().isEmpty()||String.valueOf(txtPwd.getText()).isEmpty())
             return false;
         else
             return true;
     }
     private String varifyUser()
     {
          String type; 
        if(rbtnAdmin.isSelected())
            type="Admin";
        else if(rbtnCompanyHR.isSelected())
            type="Hr";
        else if(rbtnStudent.isSelected())
            type="Pr";
        else
            type=null;
        
        return type;
     }
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
            java.util.logging.Logger.getLogger(LoginScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreenFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton rbtnAdmin;
    private javax.swing.JRadioButton rbtnCompanyHR;
    private javax.swing.JRadioButton rbtnStudent;
    private javax.swing.JTextField txtMail;
    private javax.swing.JPasswordField txtPwd;
    // End of variables declaration//GEN-END:variables
}
