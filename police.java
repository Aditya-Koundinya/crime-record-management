/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BHUVAN
 */
public class police extends javax.swing.JFrame {
Connection con = null;
PreparedStatement pst,pst2;
ResultSet rs,rs2;
    static private String a;
    /**
     * Creates new form police
     * @param a
     */
    public police(String a){
        initComponents();
        con = dbConnection.con();
        police.a = a;
        display1(a);
        display(a);
    }
     final void display1(String a)
    {
    try {
        pst = con.prepareStatement("select id_police,name,address,gender,mob_no from police where id_police = (?)" );
        pst.setString(1,a);
       rs = pst.executeQuery();
       while(rs.next())
       {
           String id = String.valueOf(rs.getString("id_police"));
           String name = String.valueOf(rs.getString("name"));
           String add = String.valueOf(rs.getString("address"));
           String gen = String.valueOf(rs.getString("gender"));
           String mob = String.valueOf(rs.getString("mob_no"));
           String tbData[] = {id,name,add,gen,mob};
           DefaultTableModel tbModel = (DefaultTableModel)tab2.getModel();
           tbModel.addRow(tbData);
           
       }
    } catch (SQLException ex) {
        Logger.getLogger(court.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    final void display(String a)
    {
    try {
       pst2 = con.prepareStatement("select id_prisoner,name,gender,mob_no,id_fir,id_crime from prisoner where id_police = (?)" );
       pst2.setString(1,a);
       rs2 = pst2.executeQuery();
       while(rs2.next())
       {
           String id = String.valueOf(rs2.getString("id_prisoner"));
           String name = String.valueOf(rs2.getString("name"));
           String gen = String.valueOf(rs2.getString("gender"));
           String mob = String.valueOf(rs2.getString("mob_no"));
           String fir = String.valueOf(rs2.getString("id_fir"));
           String crime = String.valueOf(rs2.getString("id_crime"));
           String tbData[] = {id,name,gen,mob,fir,crime};
           DefaultTableModel tbModel = (DefaultTableModel)tab1.getModel();
           tbModel.addRow(tbData);
           
       }
    } catch (SQLException ex) {
        Logger.getLogger(court.class.getName()).log(Level.SEVERE, null, ex);
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

        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tab2 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tab1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jButton4.setText("BACK");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));

        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 110, 29));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 120, 30));

        tab2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Police ID", "Name", "Address", "Gender", "Mobile"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tab2);
        if (tab2.getColumnModel().getColumnCount() > 0) {
            tab2.getColumnModel().getColumn(0).setResizable(false);
            tab2.getColumnModel().getColumn(1).setResizable(false);
            tab2.getColumnModel().getColumn(2).setResizable(false);
            tab2.getColumnModel().getColumn(3).setResizable(false);
            tab2.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 30, 670, 90));

        tab1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prisioner ID", "Name", "Gender", "Mobile", "FIR", "Crime ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tab1);
        if (tab1.getColumnModel().getColumnCount() > 0) {
            tab1.getColumnModel().getColumn(0).setResizable(false);
            tab1.getColumnModel().getColumn(1).setResizable(false);
            tab1.getColumnModel().getColumn(2).setResizable(false);
            tab1.getColumnModel().getColumn(3).setResizable(false);
            tab1.getColumnModel().getColumn(4).setResizable(false);
            tab1.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 640, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/final1/image/110217-adobestock_33754935-court-justice.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        police_login obj = new police_login();
        obj.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        police_update obj1 = new police_update(a);
        obj1.show();
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
            java.util.logging.Logger.getLogger(police.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(police.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(police.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(police.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new police(a).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tab1;
    private javax.swing.JTable tab2;
    // End of variables declaration//GEN-END:variables
}
