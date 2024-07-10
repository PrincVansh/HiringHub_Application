/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.gui;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import trandpl.dao.HrDAO;
import trandpl.dao.UsersDAO;
import trandpl.pojo.CurrentUser;
import trandpl.pojo.HrPojo;

/**
 *
 * @author hmayw
 */
public class AdminRemoveHrFrame extends javax.swing.JFrame {

    private DefaultTableModel model;
    public AdminRemoveHrFrame() {
        initComponents();
        setLocationRelativeTo(null);
        lblAdminName.setText(CurrentUser.getName());
         model=(DefaultTableModel)tblAllHr.getModel();
        loadHrDetails();
    }
      private void loadHrDetails()
    {
       try
       {
            List<HrPojo>hrList=HrDAO.getAllHr();
            if(hrList.isEmpty())
            {
                JOptionPane.showMessageDialog(this,"No Hr Present","Hr !",JOptionPane.INFORMATION_MESSAGE);
                return ;
            }
            for(HrPojo obj:hrList)
            {
                Vector<String>v=new Vector<>();
                v.add(obj.getHrId());
                v.add(obj.getUserId());
                v.add(obj.getHrName());
                v.add(obj.getMobile());
                v.add(obj.getCompanyName());
                model.addRow(v);
            }
       }
       catch(SQLException ex)
       {
           JOptionPane.showMessageDialog(this,"Error in DB","DB Error !",JOptionPane.ERROR_MESSAGE);
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
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAllHr = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lblAdminName = new javax.swing.JLabel();
        btnRemoveHr = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 76, 996, 208));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel3.setText("Welcome ,");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 302, -1, -1));

        jButton5.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jButton5.setText("Logout");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 690, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Remove-Emp.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 413, 192, 202));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel5.setText("All HR'S");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        tblAllHr.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        tblAllHr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hr Id", "User Id", "Name ", "Phone No.", "CompanyName"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAllHr);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 380, 740, 250));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 970, 20));

        lblAdminName.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jPanel1.add(lblAdminName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 170, 30));

        btnRemoveHr.setText("Remove Hr");
        btnRemoveHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveHrActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemoveHr, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 690, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TIT/logo-only (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new LoginScreenFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new AdminHRModuleFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRemoveHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveHrActionPerformed
      int row=tblAllHr.getSelectedRow();
      if(row==-1)
      {
          JOptionPane.showMessageDialog(null,"Please select a row first","Error",JOptionPane.ERROR_MESSAGE);
          return ;
      }
      String hrId=(String)tblAllHr.getValueAt(row,0);
      int resp=JOptionPane.showConfirmDialog(this,"Are you sure do you want to remove"+hrId+"?","Confirmation ?",JOptionPane.OK_CANCEL_OPTION);
      if(resp==JOptionPane.OK_OPTION)
      {
          String userId=(String)tblAllHr.getValueAt(row,1);
          try{
              boolean result=UsersDAO.removeUser(userId);
              if(result==true)
              {
                  JOptionPane.showMessageDialog(this,"Hr Succssfully removed","success",JOptionPane.INFORMATION_MESSAGE);
                  model.removeRow(row);
                  if(model.getRowCount()==0)
                  {
                      btnRemoveHr.setEnabled(false);
                  }
              }
              else
              {
                  JOptionPane.showMessageDialog(this,"Record colud not be delete","Error",JOptionPane.ERROR_MESSAGE);
              }
          }
          catch(SQLException ex)
          {
            JOptionPane.showMessageDialog(this,"Record colud not be delete","DBError",JOptionPane.ERROR_MESSAGE);  
             ex.printStackTrace();
          }
          
      }
      
    }//GEN-LAST:event_btnRemoveHrActionPerformed

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
            java.util.logging.Logger.getLogger(AdminRemoveHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRemoveHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRemoveHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRemoveHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRemoveHrFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemoveHr;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAdminName;
    private javax.swing.JTable tblAllHr;
    // End of variables declaration//GEN-END:variables
}
