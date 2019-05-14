
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jibran
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    Connection con = null;
    Statement stat = null;
    ResultSet res = null;
    public Main() {
        initComponents();
        setLocationRelativeTo(null); // To Start Screen From Center of Screen
        setTitle("ATM");
        labelAmount.setVisible(false);
        labelBalance.setVisible(false);
        labelFastCash.setVisible(false);
        labelLogout.setVisible(false);
        labelTransfer.setVisible(false);
        labelPin.setVisible(false);
        fieldpin.setVisible(false);
                
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton17 = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        four = new javax.swing.JButton();
        three = new javax.swing.JButton();
        six = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        five = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        enter = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        labelWelcome = new javax.swing.JLabel();
        labelAmount = new javax.swing.JLabel();
        labelPin = new javax.swing.JLabel();
        labelTransfer = new javax.swing.JLabel();
        labelLogout = new javax.swing.JLabel();
        labelFastCash = new javax.swing.JLabel();
        labelBalance = new javax.swing.JLabel();
        fieldpin = new javax.swing.JPasswordField();
        fieldInput = new javax.swing.JTextField();
        btnTransfer = new javax.swing.JButton();
        btnCheckBalance = new javax.swing.JButton();
        btnAmount = new javax.swing.JButton();
        btnFastCash = new javax.swing.JButton();
        btnChangePin = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        card = new javax.swing.JButton();

        jButton17.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jButton17.setText("1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        one.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        getContentPane().add(one, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 258, 97, 67));

        two.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        getContentPane().add(two, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 258, 97, 67));

        four.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        getContentPane().add(four, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 331, 97, 67));

        three.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        getContentPane().add(three, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 258, 97, 67));

        six.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        getContentPane().add(six, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 331, 97, 67));

        nine.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        getContentPane().add(nine, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 410, 97, 67));

        seven.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        getContentPane().add(seven, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 410, 97, 67));

        five.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        getContentPane().add(five, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 331, 97, 67));

        zero.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        getContentPane().add(zero, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 483, 97, 67));

        eight.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        getContentPane().add(eight, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 410, 97, 67));

        cancel.setBackground(new java.awt.Color(227, 227, 29));
        cancel.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 258, 97, 67));

        clear.setBackground(new java.awt.Color(232, 33, 43));
        clear.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 331, 97, 67));

        enter.setBackground(new java.awt.Color(27, 167, 61));
        enter.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        enter.setText("Enter");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        getContentPane().add(enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 410, 97, 67));

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelWelcome.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelWelcome.setText("Enter Card");
        jPanel3.add(labelWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        labelAmount.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelAmount.setText("Enter Amount");
        jPanel3.add(labelAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        labelPin.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelPin.setText("Change Pin");
        jPanel3.add(labelPin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        labelTransfer.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelTransfer.setText("Transfer");
        jPanel3.add(labelTransfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        labelLogout.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelLogout.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelLogout.setText("Logout");
        jPanel3.add(labelLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        labelFastCash.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelFastCash.setText("Fast Cash");
        jPanel3.add(labelFastCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        labelBalance.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelBalance.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelBalance.setText("Check Balance");
        jPanel3.add(labelBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        fieldpin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldpinActionPerformed(evt);
            }
        });
        jPanel3.add(fieldpin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 120, -1));
        jPanel3.add(fieldInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 120, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 12, 280, 220));

        btnTransfer.setText("<<");
        btnTransfer.setEnabled(false);
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });
        getContentPane().add(btnTransfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 33, 60, -1));

        btnCheckBalance.setText("<<");
        btnCheckBalance.setEnabled(false);
        getContentPane().add(btnCheckBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 102, 60, -1));

        btnAmount.setText(">>");
        btnAmount.setEnabled(false);
        btnAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmountActionPerformed(evt);
            }
        });
        getContentPane().add(btnAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 105, 51, -1));

        btnFastCash.setText(">>");
        btnFastCash.setEnabled(false);
        btnFastCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFastCashActionPerformed(evt);
            }
        });
        getContentPane().add(btnFastCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 36, 51, -1));

        btnChangePin.setText(">>");
        btnChangePin.setEnabled(false);
        btnChangePin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePinActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangePin, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 168, 51, -1));

        btnLogout.setText("<<");
        btnLogout.setEnabled(false);
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 165, 60, -1));

        card.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        card.setText("Card");
        card.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardActionPerformed(evt);
            }
        });
        getContentPane().add(card, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 495, 97, 67));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        // TODO add your handling code here:
         String s = fieldpin.getText();
        fieldpin.setText(s+"4");
        fieldInput.setText(s+"4");
    }//GEN-LAST:event_fourActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        // TODO add your handling code here:
         String s = fieldpin.getText();
        fieldpin.setText(s+"6");
        fieldInput.setText(s+"6");
    }//GEN-LAST:event_sixActionPerformed

    private void cardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardActionPerformed
        // TODO add your handling code here:
        labelWelcome.setText("Enter Pin ");
        fieldpin.setVisible(true);
        
    }//GEN-LAST:event_cardActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        // TODO add your handling code here:
        
        //connection to db 
        
        try
        {
        String que = "select * from ALI.LOGIN"; // query 
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/atm", "ali", "1234"); // connection 
        stat = con.createStatement(); // statement
        res = stat.executeQuery(que); // executing query 
        
        while(res.next())
        {
            int id = res.getInt("id");
            System.out.println(res.getInt("id"));
            int pin = Integer.parseInt(fieldpin.getText());
            if(pin == id)
            {
            labelAmount.setVisible(true);
            labelBalance.setVisible(true);
        labelFastCash.setVisible(true);
        labelLogout.setVisible(true);
        labelTransfer.setVisible(true);
        labelPin.setVisible(true);
        labelWelcome.setVisible(false);
        btnAmount.setEnabled(true);
        btnChangePin.setEnabled(true);
        btnFastCash.setEnabled(true);
        btnLogout.setEnabled(true);
        btnTransfer.setEnabled(true);
       btnCheckBalance.setEnabled(true);
       fieldpin.setVisible(false);
            }
            
        }
        
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        //connection to db 
     
    }//GEN-LAST:event_enterActionPerformed
    
    private void btnFastCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFastCashActionPerformed
        // TODO add your handling code here:
        
        
        labelAmount.setText("500");
        labelBalance.setText("1000");
        labelFastCash.setText("1500");
        labelLogout.setText("2000");
        labelTransfer.setText("5000");
        labelPin.setText("10000");
        labelWelcome.setVisible(false);
        fieldpin.setVisible(false);
        labelBalance.setHorizontalTextPosition(JLabel.LEFT);
    }//GEN-LAST:event_btnFastCashActionPerformed

    private void btnAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmountActionPerformed
        // TODO add your handling code here:
        labelWelcome.setVisible(true);
        labelWelcome.setText("Enter Amount");
        labelAmount.setVisible(false);
        labelBalance.setVisible(false);
        labelFastCash.setVisible(false);
        labelLogout.setVisible(false);
        labelTransfer.setVisible(false);
        labelPin.setVisible(false);
        fieldpin.setVisible(false);
        fieldInput.setText("");
        
    }//GEN-LAST:event_btnAmountActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        // TODO add your handling code here:
        String s = fieldpin.getText();
        fieldpin.setText(s+"0");
        fieldInput.setText(s+"0");
    }//GEN-LAST:event_zeroActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        // TODO add your handling code here:
         String s = fieldpin.getText();
        fieldpin.setText(s+"7");
        fieldInput.setText(s+"7");
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        // TODO add your handling code here:
         String s = fieldpin.getText();
        fieldpin.setText(s+"8");
        fieldInput.setText(s+"8");
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        // TODO add your handling code here:
         String s = fieldpin.getText();
        fieldpin.setText(s+"9");
        fieldInput.setText(s+"9");
    }//GEN-LAST:event_nineActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        // TODO add your handling code here:
         String s = fieldpin.getText();
        fieldpin.setText(s+"5");
        fieldInput.setText(s+"5");
    }//GEN-LAST:event_fiveActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        // TODO add your handling code here:
         String s = fieldpin.getText();
        fieldpin.setText(s+"1");
        fieldInput.setText(s+"1");
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        // TODO add your handling code here:
         String s = fieldpin.getText();
        fieldpin.setText(s+"2");
        fieldInput.setText(s+"2");
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        // TODO add your handling code here:
         String s = fieldpin.getText();
        fieldpin.setText(s+"3");
        fieldInput.setText(s+"3");
    }//GEN-LAST:event_threeActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        fieldpin.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cancelActionPerformed

    private void btnChangePinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChangePinActionPerformed

    private void fieldpinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldpinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldpinActionPerformed

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTransferActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAmount;
    private javax.swing.JButton btnChangePin;
    private javax.swing.JButton btnCheckBalance;
    private javax.swing.JButton btnFastCash;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnTransfer;
    private javax.swing.JButton cancel;
    private javax.swing.JButton card;
    private javax.swing.JButton clear;
    private javax.swing.JButton eight;
    private javax.swing.JButton enter;
    private javax.swing.JTextField fieldInput;
    private javax.swing.JPasswordField fieldpin;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton jButton17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelAmount;
    private javax.swing.JLabel labelBalance;
    private javax.swing.JLabel labelFastCash;
    private javax.swing.JLabel labelLogout;
    private javax.swing.JLabel labelPin;
    private javax.swing.JLabel labelTransfer;
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
