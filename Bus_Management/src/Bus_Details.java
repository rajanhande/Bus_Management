
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rajan
 */
public class Bus_Details extends javax.swing.JFrame {

    dbhelper db = new dbhelper();
    /**
     * Creates new form Bus_Details
     */
    public Bus_Details() {
        initComponents();
        AutoIncrement();
        db.getTable(jTable1, "select * from bus_details");
    }

    
    public void Validate() {
        if (txtBus_Id.getText().equals("")||txtBus_no.getText().equals("") || txtBus_typ.getText().equals("") || txtMin_charge.getText().equals("") || txtSeats_no.getText().equals("") || txtDepot.getText().equals("") || txtChild.getText().equals("") || txtAdult.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter all fields");
            return;
        }
    }

    public void clearText() {
        txtBus_Id.setText("");
        txtBus_no.setText("");
        txtBus_typ.setText("");
        txtMin_charge.setText("");
        txtSeats_no.setText("");
        txtDepot.setText("");
        txtChild.setText("");
        txtAdult.setText("");
        

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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblBus_typ = new javax.swing.JLabel();
        lblMin_charge = new javax.swing.JLabel();
        lblSeats_no = new javax.swing.JLabel();
        lblDepot = new javax.swing.JLabel();
        lblchild = new javax.swing.JLabel();
        txtAdult = new javax.swing.JTextField();
        txtBus_Id = new javax.swing.JTextField();
        txtBus_typ = new javax.swing.JTextField();
        txtMin_charge = new javax.swing.JTextField();
        txtSeats_no = new javax.swing.JTextField();
        txtDepot = new javax.swing.JTextField();
        txtChild = new javax.swing.JTextField();
        btnClose = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtBus_no = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        jLabel1.setText("Bus Details");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1110, 80));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel2.setText("Adult Fare");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        lblId.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        lblId.setText("ID");
        jPanel3.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblBus_typ.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        lblBus_typ.setText("Bus Type");
        jPanel3.add(lblBus_typ, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        lblMin_charge.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        lblMin_charge.setText("Minimum Charge");
        jPanel3.add(lblMin_charge, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 30));

        lblSeats_no.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        lblSeats_no.setText("NO. of Seats");
        jPanel3.add(lblSeats_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        lblDepot.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        lblDepot.setText("Depot");
        jPanel3.add(lblDepot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        lblchild.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        lblchild.setText("Child Fare");
        jPanel3.add(lblchild, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));
        jPanel3.add(txtAdult, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 160, 30));
        jPanel3.add(txtBus_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 160, 30));
        jPanel3.add(txtBus_typ, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 160, 30));
        jPanel3.add(txtMin_charge, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 160, 30));
        jPanel3.add(txtSeats_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 160, 30));
        jPanel3.add(txtDepot, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 160, 30));
        jPanel3.add(txtChild, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 160, 30));

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel3.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel3.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel3.setText("Bus NO");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));
        jPanel3.add(txtBus_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 160, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 390, 380));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Bus_NO", "Bus_type", "Min_charge", "Seat NO", "Depot", "Child_fare", "Adult_fare"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 680, 350));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 700, 380));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        AutoIncrement();
        Validate();
        
         db.InsertData("insert into bus_details(id,bus_no,bus_type,min_charge,seat_no,depot,child_fare,adult_fare) values ('" + txtBus_Id.getText() + "','"+txtBus_no.getText()+"','" + txtBus_typ.getText() + "','" + txtMin_charge.getText() + "','" + txtSeats_no.getText() + "','" + txtDepot.getText() + "','" + txtChild.getText() + "','" + txtAdult.getText() + "')");
        db.getTable(jTable1, "select * from bus_details");
        
        clearText();
        AutoIncrement();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
         db.updateRecord("update bus_details set min_charge='" + txtMin_charge.getText() + "',child_fare='" + txtChild.getText() + "',adult_fare='"+txtAdult.getText()+"' where id='" + txtBus_Id.getText() + "'");
        db.getTable(jTable1, "select * from bus_details");
        clearText();
        AutoIncrement();
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        db.DeleteData("DELETE FROM `bus_details` WHERE id='" + txtBus_Id.getText() + "'");
        db.getTable(jTable1, "select * from bus_details");
        clearText();
        AutoIncrement();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    
    public void AutoIncrement() {
        try {
            String s = "select MAX(id) from bus_details";
            db.DataFound(s);
            int i = 0;
            while (db.rs.next()) {
                i = db.rs.getInt(1);
            }
            txtBus_Id.setText(String.valueOf(i + 1));
        } catch (Exception e) {
            System.out.println(e);
        }

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
            java.util.logging.Logger.getLogger(Bus_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bus_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bus_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bus_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bus_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBus_typ;
    private javax.swing.JLabel lblDepot;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblMin_charge;
    private javax.swing.JLabel lblSeats_no;
    private javax.swing.JLabel lblchild;
    private javax.swing.JTextField txtAdult;
    private javax.swing.JTextField txtBus_Id;
    private javax.swing.JTextField txtBus_no;
    private javax.swing.JTextField txtBus_typ;
    private javax.swing.JTextField txtChild;
    private javax.swing.JTextField txtDepot;
    private javax.swing.JTextField txtMin_charge;
    private javax.swing.JTextField txtSeats_no;
    // End of variables declaration//GEN-END:variables
}
