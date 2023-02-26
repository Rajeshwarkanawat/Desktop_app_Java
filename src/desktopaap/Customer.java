
package desktopaap;



import java.sql.PreparedStatement;
import java.sql.Connection;





public class Customer extends javax.swing.JFrame {
Connection con;

    public Customer() {
        initComponents();
   
        con=DBConnection.getConn();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cnm = new javax.swing.JTextField();
        cph = new javax.swing.JTextField();
        ccity = new javax.swing.JTextField();
        home = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(100, 100, 200, 3));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer form");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 198, 51));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ph.no");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 70, 27));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("City");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 70, 27));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 70, 27));

        cnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnmActionPerformed(evt);
            }
        });
        getContentPane().add(cnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 287, 27));

        cph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cphActionPerformed(evt);
            }
        });
        getContentPane().add(cph, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 287, 27));

        ccity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccityActionPerformed(evt);
            }
        });
        getContentPane().add(ccity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 287, 27));

        home.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        submit.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        submit.setText(" Add");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 119, 53));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desktopaap/balcks.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnmActionPerformed

    private void cphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cphActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cphActionPerformed

    private void ccityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ccityActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
           this.setVisible(false);
            Demoaap.main(new String [2]);
    }//GEN-LAST:event_homeActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        
        try{
//            Class.forName("com.mysql.jdbc.Driver");// This is to open driver of the connection  
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aap", "root","");
            PreparedStatement  ps = con.prepareStatement("Insert into customer (cnm,city,ph) values(?, ?, ?)");
            ps.setString(1,cnm.getText());
            ps.setString(2,ccity.getText());
            ps.setInt(3, Integer.parseInt(cph.getText()));
            ps.executeUpdate();
            cnm.setText("");
            ccity.setText("");
            cph.setText("");
        }catch(Exception ee)
        {
            System.out.println(ee);
        }
            
    }//GEN-LAST:event_submitActionPerformed

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ccity;
    private javax.swing.JTextField cnm;
    private javax.swing.JTextField cph;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
