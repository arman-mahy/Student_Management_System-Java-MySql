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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class addstudent extends javax.swing.JFrame {

    /**
     * Creates new form addstudent
     */
   
    
    public addstudent() {
        initComponents();
        fetch();
       
    }
    public void fetch(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","");
            
            Statement st = conn.createStatement();
            String sql  ="select * from stureg";
            PreparedStatement ptst = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs= ptst.executeQuery();
            DefaultTableModel tm =(DefaultTableModel)jTable2.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object o[]={rs.getInt("id"),rs.getString("sname"),rs.getInt("semester"),rs.getString("fname"),
                        rs.getString("mname"),rs.getString("address"),rs.getString("mail"),rs.getString("dept")
                };
                tm.addRow(o);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        sid = new javax.swing.JTextField();
        ssem = new javax.swing.JTextField();
        sfather = new javax.swing.JTextField();
        smother = new javax.swing.JTextField();
        saddress = new javax.swing.JTextField();
        smail = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        smail1 = new javax.swing.JTextField();
        sdept = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, -1, 41));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" STUDENT REGISTRATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, 68));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name  :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Father's Name: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mother's Name:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Department: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Edu Mail: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, 31));
        getContentPane().add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 289, -1));
        getContentPane().add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 289, -1));
        getContentPane().add(ssem, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 289, -1));
        getContentPane().add(sfather, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 289, -1));
        getContentPane().add(smother, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 289, -1));

        saddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saddressActionPerformed(evt);
            }
        });
        getContentPane().add(saddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 290, -1));

        smail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smailActionPerformed(evt);
            }
        });
        getContentPane().add(smail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 290, -1));

        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 14)); // NOI18N
        jButton2.setText("SUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 650, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Semester :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        smail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smail1ActionPerformed(evt);
            }
        });
        getContentPane().add(smail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 290, -1));

        sdept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdeptActionPerformed(evt);
            }
        });
        getContentPane().add(sdept, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 290, -1));

        jTable2.setBackground(new java.awt.Color(229, 231, 168));
        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable2.setForeground(new java.awt.Color(255, 0, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "ID", "Semester", "Father's Name", "Mother's Name", "Address", "Edu Mail", "Department"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 660, 350));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smsystem/frontbk1.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        studentModule obj = new studentModule();
        obj.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void saddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saddressActionPerformed

    private void smailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_smailActionPerformed

    private void smail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_smail1ActionPerformed

    private void sdeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sdeptActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:add student
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","");
            
            String sql = "insert into stureg values(?,?,?,?,?,?,?,?)";
            PreparedStatement ptsmt = (PreparedStatement) conn.prepareStatement(sql);
            
        ptsmt.setString(1, sid.getText());
        ptsmt.setString(2, sname.getText());
        ptsmt.setString(3, ssem.getText());
        ptsmt.setString(4, sfather.getText());
        ptsmt.setString(5, smother.getText());
        ptsmt.setString(6, saddress.getText());
        ptsmt.setString(7, smail.getText());
        ptsmt.setString(8, sdept.getText());
        
        
        ptsmt.executeUpdate();
        
        if(sid.getText().equals("")&& sname.getText().equals("") && ssem.getText().equals("") && sfather.getText().equals("") && smother.getText().equals("") 
                && saddress.getText().equals("") && smail.getText().equals("") && sdept.getText().equals("")){
        
            //if annnny of 5 field left blank than show massege
            JOptionPane.showMessageDialog(this, "Please Enter All Data properly!!");
        }
     
                JOptionPane.showMessageDialog(null, "Data Recorded Successfully!!");
        conn.close();
        sid.setText("");
        sname.setText("");
        ssem.setText("");
        sfather.setText("");
        smother.setText("");
        saddress.setText("");
        smail.setText("");
        sdept.setText("");
        
        fetch();
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:

        DefaultTableModel d = (DefaultTableModel)jTable2.getModel();

        int selectIndex = jTable2.getSelectedRow();
        sid.setText(d.getValueAt(selectIndex, 0).toString());
        sname.setText(d.getValueAt(selectIndex, 1).toString());
        
        ssem.setText(d.getValueAt(selectIndex, 2).toString());
        sfather.setText(d.getValueAt(selectIndex, 3).toString());
        smother.setText(d.getValueAt(selectIndex, 4).toString());
        saddress.setText(d.getValueAt(selectIndex, 5).toString());
        smail.setText(d.getValueAt(selectIndex, 6).toString());
        sdept.setText(d.getValueAt(selectIndex, 7).toString());

        jButton2.setEnabled(false);

    }//GEN-LAST:event_jTable2MouseClicked

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
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addstudent().setVisible(true);
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField saddress;
    private javax.swing.JTextField sdept;
    private javax.swing.JTextField sfather;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField smail;
    private javax.swing.JTextField smail1;
    private javax.swing.JTextField smother;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField ssem;
    // End of variables declaration//GEN-END:variables
}
