
import java.text.SimpleDateFormat;
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
public class Route extends javax.swing.JFrame {

    dbhelper db = new dbhelper();

    /**
     * Creates new form Route
     */
    public Route() {
        initComponents();
        AutoIncrement();
        db.getTable(jTable1, "select * from route_info");

    }

    public void Validate() {
        if (txtRoute_Id.getText().equals("") || txtRoute_no.getText().equals("") || txtNo_of_stop.getText().equals("") || txtFare_stage.getText().equals("") || txtStart.getText().equals("") || txtStop.getText().equals("") || txtStart_time.getText().equals("") || txtStop_time.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter all fields");
        }
    }

    public void clearText() {
        txtRoute_Id.setText("");
        txtRoute_no.setText("");
        txtNo_of_stop.setText("");
        txtFare_stage.setText("");
        txtStart.setText("");
        txtStop.setText("");
        txtStart_time.setText("");
        txtStop_time.setText("");

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
        lblstop_time = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        lblroute_no = new javax.swing.JLabel();
        lblno_of_stop = new javax.swing.JLabel();
        lblfare_stage = new javax.swing.JLabel();
        lblstart = new javax.swing.JLabel();
        lblstop = new javax.swing.JLabel();
        lblstart_time = new javax.swing.JLabel();
        txtStop_time = new javax.swing.JTextField();
        txtRoute_Id = new javax.swing.JTextField();
        txtRoute_no = new javax.swing.JTextField();
        txtNo_of_stop = new javax.swing.JTextField();
        txtFare_stage = new javax.swing.JTextField();
        txtStart = new javax.swing.JTextField();
        txtStop = new javax.swing.JTextField();
        txtStart_time = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setText("Route Information");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 320, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 930, 80));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblstop_time.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        lblstop_time.setText("Stop Time");
        jPanel3.add(lblstop_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        lblid.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        lblid.setText("ID ");
        jPanel3.add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        lblroute_no.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        lblroute_no.setText("Route No");
        jPanel3.add(lblroute_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        lblno_of_stop.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        lblno_of_stop.setText("Number of Stop");
        jPanel3.add(lblno_of_stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        lblfare_stage.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        lblfare_stage.setText("Fare Stage");
        jPanel3.add(lblfare_stage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        lblstart.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        lblstart.setText("Start ");
        jPanel3.add(lblstart, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        lblstop.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        lblstop.setText("Stop");
        jPanel3.add(lblstop, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        lblstart_time.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        lblstart_time.setText("Start Time");
        jPanel3.add(lblstart_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        txtStop_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStop_timeActionPerformed(evt);
            }
        });
        jPanel3.add(txtStop_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 140, 30));
        jPanel3.add(txtRoute_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 140, 30));
        jPanel3.add(txtRoute_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 140, 30));
        jPanel3.add(txtNo_of_stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 140, 30));
        jPanel3.add(txtFare_stage, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 140, 30));
        jPanel3.add(txtStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 140, 30));

        txtStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStopActionPerformed(evt);
            }
        });
        jPanel3.add(txtStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 140, 30));

        txtStart_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStart_timeActionPerformed(evt);
            }
        });
        jPanel3.add(txtStart_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 140, 30));

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 80, -1));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel3.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 90, -1));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 90, -1));

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel3.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 370, 80, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 410, 410));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Route_no", "Satge_No", "Fare_Stage", "Start", "Stop", "Start_time", "Stop_time"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 480, 360));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 500, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtStop_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStop_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStop_timeActionPerformed

    private void txtStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStopActionPerformed

    private void txtStart_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStart_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStart_timeActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        AutoIncrement();
        Validate();

        db.InsertData("insert into route_info(id,route_no,no_of_stop,fare_stage,start,stop,start_time,stop_time) values ('" + txtRoute_Id.getText() + "','" + txtRoute_no.getText() + "'," + txtNo_of_stop.getText() + ",'" + txtFare_stage.getText() + "','" + txtStart.getText() + "','" + txtStop.getText() + "','" + txtStart_time.getText() + "','" + txtStop_time.getText() + "')");
        db.getTable(jTable1, "select * from route_info");

        clearText();
        AutoIncrement();

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        db.updateRecord("update route_info set start_time='" + txtStart_time.getText() + "',stop_time='" + txtStop_time.getText() + "' where id='" + txtRoute_Id.getText() + "'");
        db.getTable(jTable1, "select * from route_info");
        clearText();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        //System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        db.DeleteData("DELETE FROM `route_info` WHERE id='" + txtRoute_Id.getText() + "'");
        db.getTable(jTable1, "select * from route_info");
        clearText();
        AutoIncrement();
    }//GEN-LAST:event_btnDeleteActionPerformed

    public void AutoIncrement() {
        try {
            String s = "select MAX(id) from route_info";
            db.DataFound(s);
            int i = 0;
            while (db.rs.next()) {
                i = db.rs.getInt(1);
            }
            txtRoute_Id.setText(String.valueOf(i + 1));
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
            java.util.logging.Logger.getLogger(Route.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Route.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Route.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Route.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Route().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblfare_stage;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblno_of_stop;
    private javax.swing.JLabel lblroute_no;
    private javax.swing.JLabel lblstart;
    private javax.swing.JLabel lblstart_time;
    private javax.swing.JLabel lblstop;
    private javax.swing.JLabel lblstop_time;
    private javax.swing.JTextField txtFare_stage;
    private javax.swing.JTextField txtNo_of_stop;
    private javax.swing.JTextField txtRoute_Id;
    private javax.swing.JTextField txtRoute_no;
    private javax.swing.JTextField txtStart;
    private javax.swing.JTextField txtStart_time;
    private javax.swing.JTextField txtStop;
    private javax.swing.JTextField txtStop_time;
    // End of variables declaration//GEN-END:variables
}