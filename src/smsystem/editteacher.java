/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smsystem;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class editteacher extends javax.swing.JFrame {

    /**
     * Creates new form editteacher
     */
    public editteacher() {
        initComponents();
        fetch();
    }
    
    public void fetch(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","");
            
            Statement st = conn.createStatement();
            String sql  ="select * from teachreg";
            PreparedStatement ptst = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs= ptst.executeQuery();
            DefaultTableModel tm =(DefaultTableModel)jTable1.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object o[]={rs.getString("tname"),rs.getInt("tid"),rs.getString("tdept"),
                        rs.getString("tadd"),rs.getString("tmail"),rs.getInt("tphone")
                };
                tm.addRow(o);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
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

        tn = new javax.swing.JTextField();
        tid = new javax.swing.JTextField();
        tdept = new javax.swing.JTextField();
        taddress = new javax.swing.JTextField();
        tmail = new javax.swing.JTextField();
        tphone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(tn, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 163, 289, -1));
        getContentPane().add(tid, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 205, 289, -1));
        getContentPane().add(tdept, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 247, 289, -1));
        getContentPane().add(taddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 299, 289, -1));
        getContentPane().add(tmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 351, 289, -1));

        tphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tphoneActionPerformed(evt);
            }
        });
        getContentPane().add(tphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 403, 290, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name  :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 163, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Teacher's ID : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 203, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Depertment");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 243, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 295, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mail :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 345, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 395, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Teacher's ID", "Department", "Address", "Mail", "Phone"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 145, 540, 427));

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, 90, 30));

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 630, 110, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("EDIT TEACHER'S LIST");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 280, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smsystem/frontbk1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tphoneActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","");
             //String sql = "update `stureg` SET `fname`='"+sfather+"',`sname`='"+sname+"',`mname`='"+smother+"',`semester`='"+ssem+"'"
                 //    + ",`address`='"+saddress+"',`mail`='"+smail+"',`dept`='"+sdept+"'WHERE id = '"+sid+"'";
                 
                 /*String sql = "update teachreg set tname = ?, tdept = ?, tadd = ?, tmail = ?, tphone = ? where tid = ? ";
        */
                 String sql = "Update sms.teachreg set tname='" + tn.getText() + "'" + ",tphone='" + tphone.getText() + "'" + ",tdept='" + tdept.getText() + "'" + ",tadd='" + taddress.getText() + "'" + ",tmail='" + tmail.getText() + "'" + "where tid=" + tid.getText();
                 PreparedStatement ptsmt = (PreparedStatement) conn.prepareStatement(sql);
        
         
        
        /*
        
        */
        
         /*ptsmt.setString(1, tn.getText());
        ptsmt.setString(2, tid.getText());
        ptsmt.setString(3, tdept.getText());
        ptsmt.setString(4, taddress.getText());
        ptsmt.setString(5, tmail.getText());
        ptsmt.setString(6, tphone.getText());
        
        */
        
        ptsmt.executeUpdate();
        if(tn.getText().equals("")&& tid.getText().equals("") && tdept.getText().equals("") && taddress.getText().equals("") && tmail.getText().equals("") 
                && tphone.getText().equals("") ){
        
            //if annnny of 5 field left blank than show massege
            JOptionPane.showMessageDialog(this, "Please Enter All Data properly!!");
        }
     
                JOptionPane.showMessageDialog(null, "Data Recorded Successfully!!");
        conn.close();
        tn.setText("");
        tid.setText("");
        tdept.setText("");
        taddress.setText("");
        tmail.setText("");
        tphone.setText("");
        
        
        fetch();
        }
        catch(Exception e ){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
        
        int selectIndex = jTable1.getSelectedRow();
        tn.setText(d.getValueAt(selectIndex, 0).toString());
        tid.setText(d.getValueAt(selectIndex, 1).toString());
        tdept.setText(d.getValueAt(selectIndex, 2).toString());
        taddress.setText(d.getValueAt(selectIndex, 3).toString());
        tmail.setText(d.getValueAt(selectIndex, 4).toString());
        tphone.setText(d.getValueAt(selectIndex, 5).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new teachersModule().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(editteacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editteacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editteacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editteacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editteacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField taddress;
    private javax.swing.JTextField tdept;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField tmail;
    private javax.swing.JTextField tn;
    private javax.swing.JTextField tphone;
    // End of variables declaration//GEN-END:variables
}
