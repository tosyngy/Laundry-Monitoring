package laundry;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author damhiesax
 */
public class ClearData extends javax.swing.JFrame {
    FormatDate fDate = new FormatDate();
   Date d;
   DbConnect dbcon= new DbConnect();
    /**
     * Creates new form ClearData
     */
    public ClearData() {
        initComponents();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dateChooserCombo3 = new datechooser.beans.DateChooserCombo();
        dateChooserCombo2 = new datechooser.beans.DateChooserCombo();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel4.setText("To");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(190, 50, 20, 14);

        jLabel3.setText("From");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 50, 30, 14);

        dateChooserCombo3.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateChooserCombo3.addCommitListener(new datechooser.events.CommitListener() {
        public void onCommit(datechooser.events.CommitEvent evt) {
            dateChooserCombo3OnCommit(evt);
        }
    });
    jPanel1.add(dateChooserCombo3);
    dateChooserCombo3.setBounds(210, 50, 110, 20);

    dateChooserCombo2.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
dateChooserCombo2.addCommitListener(new datechooser.events.CommitListener() {
    public void onCommit(datechooser.events.CommitEvent evt) {
        dateChooserCombo2OnCommit(evt);
    }
    });
    jPanel1.add(dateChooserCombo2);
    dateChooserCombo2.setBounds(70, 50, 110, 20);

    jButton1.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
    jButton1.setText("Clear Data");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });
    jPanel1.add(jButton1);
    jButton1.setBounds(50, 90, 120, 27);

    jButton2.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
    jButton2.setText("Close");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
        }
    });
    jPanel1.add(jButton2);
    jButton2.setBounds(210, 90, 70, 27);

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
    jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Select Interval"));
    jPanel1.add(jLabel1);
    jLabel1.setBounds(30, 30, 310, 60);

    jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    jPanel1.add(jLabel2);
    jLabel2.setBounds(20, 20, 330, 110);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int a = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to close app");
        if (a == JOptionPane.YES_OPTION) {
           this.setVisible(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void dateChooserCombo3OnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_dateChooserCombo3OnCommit
        // TODO add your handling code here:
    }//GEN-LAST:event_dateChooserCombo3OnCommit

    private void dateChooserCombo2OnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_dateChooserCombo2OnCommit
     

        // TODO add your handling code here:
    }//GEN-LAST:event_dateChooserCombo2OnCommit

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        String startDate = fDate.getDateFormat(dateChooserCombo2.getText());
          String  stopDate = fDate.getDateFormat(dateChooserCombo3.getText());
           
            boolean chkIt = fDate.checkDate(startDate, stopDate);
            if (!chkIt) {
                JOptionPane.showMessageDialog(rootPane, "Date not properly selected\nMake sure you selected a valid date");
                return;
            }
            do {
                if (stopDate.equalsIgnoreCase(startDate)) {
                break;
                }
                d = new Date(startDate);
                delete(dateFormat.format(d));
                 startDate = fDate.getDate(startDate);
            } while ((!stopDate.equalsIgnoreCase(startDate)));
            d = new Date(startDate);
            delete(dateFormat.format(d));
                JOptionPane.showMessageDialog(rootPane, "<html>Data Cleared <i>From</i> <b>"+dateChooserCombo2.getText()+"</b> <i>To</i> <b>"+dateChooserCombo3.getText()+"</b>");

        
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(ClearData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClearData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClearData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClearData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClearData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserCombo2;
    private datechooser.beans.DateChooserCombo dateChooserCombo3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
void delete(String del){
String bill_no="";
    try {
      dbcon.rs = dbcon.st.executeQuery("select bill_no from bill_record WHERE date = '"+del+"'");
              while (dbcon.rs.next()) {  
               bill_no=dbcon.rs.getString("bill_no");
                 dbcon.ps = dbcon.con.prepareStatement("delete from update_payment WHERE bill_no = '"+bill_no+"'");
                 dbcon.ps.execute();
               }
   
      dbcon.ps = dbcon.con.prepareStatement("delete from bill_record WHERE date = '"+del+"'");
      dbcon.ps.execute(); 
      dbcon.ps = dbcon.con.prepareStatement("delete from order_record WHERE date = '"+del+"'");
      dbcon.ps.execute(); 
   } catch (Exception e) {
      e.printStackTrace();
    }

}
}