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
public class user extends javax.swing.JFrame {
Connection con = null;
PreparedStatement pst,pst1,pst2;
ResultSet rs,rs1,rs2;
    static private String c;
    /**
     * Creates new form user
     * @param c
     */
    public user(String c) {
        initComponents();
        con = dbConnection.con();
        user.c = c;
        display(c);
        display1(c);
        display2(c);
    }
final void display(String c)
    {
    try {
        pst = con.prepareStatement("select name,address,gender,mob_no from victim where id_victim = (?)" );
        pst.setString(1,c);
       rs = pst.executeQuery();
       while(rs.next())
       {
           String name = String.valueOf(rs.getString("name"));
           String add = String.valueOf(rs.getString("address"));
           String gen = String.valueOf(rs.getString("gender"));
           String mob = String.valueOf(rs.getString("mob_no"));
           String tbData[] = {name,add,gen,mob};
           DefaultTableModel tbModel = (DefaultTableModel)tab1.getModel();
           tbModel.addRow(tbData);
           
       }
    } catch (SQLException ex) {
        Logger.getLogger(court.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    final void display1(String c)
    {
    try {
        pst1 = con.prepareStatement("select id_court,id_prisoner,name,last_hearing_date,next_hearing_date,sentence,status from court where id_victim = (?)" );
        pst1.setString(1,c);
       rs1 = pst1.executeQuery();
       while(rs1.next())
       {
           String cid = String.valueOf(rs1.getString("id_court"));
           String id = String.valueOf(rs1.getString("id_prisoner"));
           String name = String.valueOf(rs1.getString("name"));
           String lh = String.valueOf(rs1.getString("last_hearing_date"));
           String nh = String.valueOf(rs1.getString("next_hearing_date"));
           String sen = String.valueOf(rs1.getString("sentence"));
           String stat = String.valueOf(rs1.getString("status"));
           String tbData[] = {cid,id,name,lh,nh,sen,stat};
           DefaultTableModel tbModel = (DefaultTableModel)tab2.getModel();
           tbModel.addRow(tbData);
           
       }
    } catch (SQLException ex) {
        Logger.getLogger(court.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    final void display2(String c)
    {
    try {
        pst2 = con.prepareStatement("select id_FIR,FIR_desc,FIR_date from FIR where id_victim = (?)" );
        pst2.setString(1,c);
       rs2 = pst2.executeQuery();
       while(rs2.next())
       {
           String id = String.valueOf(rs2.getString("id_FIR"));
           String desc = String.valueOf(rs2.getString("FIR_desc"));
           String date = String.valueOf(rs2.getString("FIR_date"));
           String tbData[] = {id,desc,date};
           DefaultTableModel tbModel = (DefaultTableModel)tab3.getModel();
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

        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tab2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));

        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 120, 33));

        tab2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Court ID", "Prisoner ID", "Name", "Last Hearing date", "Next Hearing Date", "Sentence", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tab2);
        if (tab2.getColumnModel().getColumnCount() > 0) {
            tab2.getColumnModel().getColumn(0).setResizable(false);
            tab2.getColumnModel().getColumn(1).setResizable(false);
            tab2.getColumnModel().getColumn(2).setResizable(false);
            tab2.getColumnModel().getColumn(3).setResizable(false);
            tab2.getColumnModel().getColumn(4).setResizable(false);
            tab2.getColumnModel().getColumn(5).setResizable(false);
            tab2.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 680, 90));

        tab1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Address", "Gender", "Mobile "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tab1);
        if (tab1.getColumnModel().getColumnCount() > 0) {
            tab1.getColumnModel().getColumn(0).setResizable(false);
            tab1.getColumnModel().getColumn(1).setResizable(false);
            tab1.getColumnModel().getColumn(2).setResizable(false);
            tab1.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 630, 90));

        tab3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FIR ID", "FIR description", "FIR date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tab3);
        if (tab3.getColumnModel().getColumnCount() > 0) {
            tab3.getColumnModel().getColumn(0).setResizable(false);
            tab3.getColumnModel().getColumn(1).setResizable(false);
            tab3.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/final1/image/prison-1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        user_login obj = new user_login();
        obj.show();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user(c).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tab1;
    private javax.swing.JTable tab2;
    private javax.swing.JTable tab3;
    // End of variables declaration//GEN-END:variables
}
