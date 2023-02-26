
package desktopaap;

public class Demoaap extends javax.swing.JFrame {

    /**
     * Creates new form Demoaap
     */
    public Demoaap() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        item = new javax.swing.JMenuItem();
        customer = new javax.swing.JMenuItem();
        purchase = new javax.swing.JMenu();
        prform = new javax.swing.JMenuItem();
        purchasehistory = new javax.swing.JMenuItem();
        saleform = new javax.swing.JMenu();
        salesform = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        report = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 110, 46));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desktopaap/balcks.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 710, 430));

        jMenuBar1.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N

        jMenu1.setText("Acc.Master");
        jMenu1.setFocusable(false);
        jMenu1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N

        item.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        item.setText("Item ");
        item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActionPerformed(evt);
            }
        });
        jMenu1.add(item);

        customer.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        customer.setText("Customer");
        customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerActionPerformed(evt);
            }
        });
        jMenu1.add(customer);

        jMenuBar1.add(jMenu1);

        purchase.setText("Purchase");
        purchase.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseActionPerformed(evt);
            }
        });

        prform.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        prform.setText("Purchaseform");
        prform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prformActionPerformed(evt);
            }
        });
        purchase.add(prform);

        purchasehistory.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        purchasehistory.setText("Purchase Report");
        purchasehistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchasehistoryActionPerformed(evt);
            }
        });
        purchase.add(purchasehistory);

        jMenuBar1.add(purchase);

        saleform.setText("Sales");
        saleform.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        saleform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleformActionPerformed(evt);
            }
        });

        salesform.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        salesform.setText("Sales form");
        salesform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesformActionPerformed(evt);
            }
        });
        saleform.add(salesform);

        jMenuItem2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jMenuItem2.setText("Sales Report");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        saleform.add(jMenuItem2);

        jMenuBar1.add(saleform);

        jMenu3.setText("Report");
        jMenu3.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N

        report.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        report.setText("Stock Report ");
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });
        jMenu3.add(report);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseActionPerformed
//            this.setVisible(false);
//            Purchase.main(new String[2]);
    }//GEN-LAST:event_purchaseActionPerformed

    private void prformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prformActionPerformed
              this.setVisible(false);
            Purchase.main(new String[2]);    }//GEN-LAST:event_prformActionPerformed

    private void itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActionPerformed
             this.setVisible(false);
              Item.main(new String[2]);
    }//GEN-LAST:event_itemActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
            this.setVisible(false);
            login.main(new String [2]);
    }//GEN-LAST:event_logoutActionPerformed

    private void customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerActionPerformed
             this.setVisible(false);
            Customer.main(new String [2]);        // TODO add your handling code here:
    }//GEN-LAST:event_customerActionPerformed

    private void saleformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleformActionPerformed
            
    }//GEN-LAST:event_saleformActionPerformed

    private void salesformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesformActionPerformed
       this.setVisible(false);
            Sales.main(new String [2]);     
    }//GEN-LAST:event_salesformActionPerformed

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed
            this.setVisible(false);
            Report.main(new String [2]);       }//GEN-LAST:event_reportActionPerformed

    private void purchasehistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchasehistoryActionPerformed
        this.setVisible(false);
        Purchasehistory.main(new String [2]);
    }//GEN-LAST:event_purchasehistoryActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       this.setVisible(false);
       Saleshistory.main(new String [2]);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(Demoaap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Demoaap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Demoaap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Demoaap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Demoaap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem customer;
    private javax.swing.JMenuItem item;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JButton logout;
    private javax.swing.JMenuItem prform;
    private javax.swing.JMenu purchase;
    private javax.swing.JMenuItem purchasehistory;
    private javax.swing.JMenuItem report;
    private javax.swing.JMenu saleform;
    private javax.swing.JMenuItem salesform;
    // End of variables declaration//GEN-END:variables
}
