package laundry;

import javax.swing.DefaultComboBoxModel;
import sun.font.StrikeMetrics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author damhiesax
 */
public class CancelBills extends javax.swing.JFrame {
 DbConnect dbcon = new DbConnect();
  DbConnect dbcon2 = new DbConnect();
String key="";
    DefaultComboBoxModel combomodel;
    /**
     * Creates new form CancelBills
     */
    public CancelBills() {
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
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        comboItemCode = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        dateChooserCombo1.setCurrentView(new datechooser.view.appearance.AppearancesList("Dali",
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
    dateChooserCombo1.setCalendarBackground(new java.awt.Color(255, 255, 255));
    dateChooserCombo1.setFormat(2);
    dateChooserCombo1.setEnabled(false);
    dateChooserCombo1.setLocale(new java.util.Locale("en", "IE", ""));
    dateChooserCombo1.addCommitListener(new datechooser.events.CommitListener() {
        public void onCommit(datechooser.events.CommitEvent evt) {
            dateChooserCombo1OnCommit(evt);
        }
    });
    jPanel1.add(dateChooserCombo1);
    dateChooserCombo1.setBounds(160, 110, 120, 20);

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel1.setText("Bill No");
    jPanel1.add(jLabel1);
    jLabel1.setBounds(40, 70, 60, 15);

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel2.setText("Cancel Date");
    jPanel1.add(jLabel2);
    jLabel2.setBounds(40, 110, 90, 15);

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel3.setText("Reason");
    jPanel1.add(jLabel3);
    jLabel3.setBounds(40, 160, 60, 15);

    jButton1.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
    jButton1.setText("Update");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });
    jPanel1.add(jButton1);
    jButton1.setBounds(50, 230, 90, 27);

    jButton2.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
    jButton2.setText("Close");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
        }
    });
    jPanel1.add(jButton2);
    jButton2.setBounds(250, 230, 100, 27);

    comboItemCode.setEditable(true);
    comboItemCode.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    comboItemCode.setEditable(true);
    comboItemCode.getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {

        @Override
        public void keyReleased(KeyEvent event) {
            key=key+event.getKeyChar();

            if(event.getKeyChar()=='\b'){
                key="";
            }
            if (!(event.getKeyChar() == KeyEvent.VK_ENTER)) {
                System.out.println(""+event.getKeyChar());
                getItems(key);
            }
        }
        public void keyPressed(KeyEvent event) {
            combomodel =new DefaultComboBoxModel();
            if(combomodel.getSize()==0){
                combomodel.addElement(key);
                comboItemCode.setModel(combomodel);
            }else{
                combomodel.insertElementAt(key,0);
                comboItemCode.setModel(combomodel);
            }

        }
    });
    comboItemCode.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            comboItemCodeMouseClicked(evt);
        }
        public void mousePressed(java.awt.event.MouseEvent evt) {
            comboItemCodeMousePressed(evt);
        }
    });
    comboItemCode.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            comboItemCodeActionPerformed(evt);
        }
    });
    comboItemCode.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            comboItemCodeKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            comboItemCodeKeyTyped(evt);
        }
    });
    jPanel1.add(comboItemCode);
    comboItemCode.setBounds(160, 70, 120, 20);

    jLabel4.setBackground(new java.awt.Color(204, 204, 204));
    jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    jPanel1.add(jLabel4);
    jLabel4.setBounds(10, 20, 390, 240);

    jTextArea1.setColumns(20);
    jTextArea1.setRows(5);
    jScrollPane1.setViewportView(jTextArea1);

    jPanel1.add(jScrollPane1);
    jScrollPane1.setBounds(150, 146, 200, 80);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dateChooserCombo1OnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_dateChooserCombo1OnCommit
    
    }//GEN-LAST:event_dateChooserCombo1OnCommit

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     int a = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to close app");
        if (a == JOptionPane.YES_OPTION) {
           this.setVisible(false);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       update();
       insert();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboItemCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboItemCodeMouseClicked
        //getItem();        // TODO add your handling code here:
    }//GEN-LAST:event_comboItemCodeMouseClicked

    private void comboItemCodeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboItemCodeMousePressed
        //getItem();        // TODO add your handling code here:
    }//GEN-LAST:event_comboItemCodeMousePressed

    private void comboItemCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboItemCodeActionPerformed
  
    }//GEN-LAST:event_comboItemCodeActionPerformed

    private void comboItemCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboItemCodeKeyPressed
        //  comboItemCode.addItem(key);
    }//GEN-LAST:event_comboItemCodeKeyPressed

    private void comboItemCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboItemCodeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_comboItemCodeKeyTyped

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
            java.util.logging.Logger.getLogger(CancelBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancelBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancelBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancelBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancelBills().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboItemCode;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

 private void update() {
    
        try {
            dbcon.ps = dbcon.con.prepareStatement("update bill_record set cancel=\"1\" where bill_no='"+comboItemCode.getSelectedItem().toString()+"' and cancel <> 1");
            dbcon.ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("red " + e.getMessage());
        }
    }
  private void insert() {
    
      double adv=0;
      double bal=0;
      double tot=0;
            combomodel =new DefaultComboBoxModel();
        try {
                dbcon.rs = dbcon.st.executeQuery("select total from bill_record WHERE bill_no=  '"+comboItemCode.getSelectedItem().toString()+"'");
                if (dbcon.rs.next()) {  
                   tot=dbcon.rs.getDouble("total");
                dbcon2.rs = dbcon2.st.executeQuery("select amt,balance from update_payment WHERE bill_no=  '"+comboItemCode.getSelectedItem().toString()+"'");
               while (dbcon2.rs.next()) {  
               bal=  dbcon2.rs.getDouble("balance");
                adv+= dbcon2.rs.getDouble("amt");  
              }   
                   
              }
             dbcon.ps = dbcon.con.prepareStatement("insert into cancel_bill values (?,?,?,?,?,?,?)");
                    dbcon.ps.setInt(1, 0);
                    dbcon.ps.setString(2, comboItemCode.getSelectedItem().toString());
                    dbcon.ps.setString(3, jTextArea1.getText());
                    dbcon.ps.setDouble(4, tot);
                    dbcon.ps.setDouble(5, adv);
                    dbcon.ps.setDouble(6, bal);
                    dbcon.ps.setString(7, dateChooserCombo1.getText());
                    dbcon.ps.executeUpdate();
                     JOptionPane.showMessageDialog(null, "Bill Cancel");
                   
        } catch (Exception e) {
            System.out.println("get item " + e);
        }
    }
 
public void getItems(String key) {
            combomodel =new DefaultComboBoxModel();
        try {
                dbcon.rs = dbcon.st.executeQuery("select bill_no from bill_record WHERE bill_no like '"+"%"+key+"%"+"'");
               
                while (dbcon.rs.next()) {  
                   combomodel.addElement(dbcon.rs.getString("bill_no"));
              
            }
                  comboItemCode.setModel(combomodel);
                
 
        } catch (Exception e) {
            System.out.println("get item " + e);
        }
    }    
}