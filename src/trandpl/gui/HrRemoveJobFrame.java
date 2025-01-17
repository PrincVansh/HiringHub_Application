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
import trandpl.dao.JobDAO;
import trandpl.pojo.CurrentUser;
import trandpl.pojo.JobPojo;

/**
 *
 * @author hmayw
 */
public class HrRemoveJobFrame extends javax.swing.JFrame {

    DefaultTableModel model;
    public HrRemoveJobFrame() {
        initComponents();
        setLocationRelativeTo(null);
        lblHrName.setText(CurrentUser.getName());
        model=(DefaultTableModel)tblAllJobs.getModel();
        loadJobs();
    }
    private void loadJobs()
    {
        try
        {
            List<JobPojo>jobs=JobDAO.getActiveJobs(CurrentUser.getId());
            if(jobs.isEmpty())
            {
                JOptionPane.showMessageDialog(null,"There is no job","Job !",JOptionPane.ERROR_MESSAGE);
                return ;
            }
            for(JobPojo obj:jobs)
            {
                Vector<String> v=new Vector<>();
                v.add(obj.getJobId());
                v.add(obj.getJobTitle());
                v.add(obj.getTags());
                v.add(String.valueOf(obj.getStatus()));
                
                model.addRow(v);
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"DB Error ","DB !",JOptionPane.ERROR_MESSAGE);
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
        tblAllJobs = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lblHrName = new javax.swing.JLabel();
        btnRemoveJob = new javax.swing.JButton();
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
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 670, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newimages/new/removeJob.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 192, 202));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 670, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel5.setText("All JOB'S");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        tblAllJobs.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        tblAllJobs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job Id", "Job Title", "Skills", "Status."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAllJobs);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 380, 740, 250));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, 970, 10));

        lblHrName.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jPanel1.add(lblHrName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 170, 30));

        btnRemoveJob.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        btnRemoveJob.setText("Remove Job");
        btnRemoveJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveJobActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemoveJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 670, 230, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TIT/logo-only (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new LoginScreenFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new HrJobOptionsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRemoveJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveJobActionPerformed
      
       int row=tblAllJobs.getSelectedRow();
       if(row==-1)
       {
           JOptionPane.showMessageDialog(null,"Please select a Job First","alert !",JOptionPane.ERROR_MESSAGE);
           return ;
       }
       String jobId=tblAllJobs.getValueAt(row,0).toString();
       try{
            boolean result=JobDAO.removeJob(jobId);
            if(result==true)
            {
               JOptionPane.showMessageDialog(null,"Job Successfully delted ","Success",JOptionPane.INFORMATION_MESSAGE) ;
               model.removeRow(row);
               if(tblAllJobs.getRowCount()==0)
                   btnRemoveJob.setEnabled(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Job could not be deleted ","Error !",JOptionPane.ERROR_MESSAGE);
            }
       }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"DB Error ","DB !",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
       
    }//GEN-LAST:event_btnRemoveJobActionPerformed

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
            java.util.logging.Logger.getLogger(HrRemoveJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HrRemoveJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HrRemoveJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HrRemoveJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HrRemoveJobFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemoveJob;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblHrName;
    private javax.swing.JTable tblAllJobs;
    // End of variables declaration//GEN-END:variables
}
