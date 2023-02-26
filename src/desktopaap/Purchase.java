package desktopaap;
// This form is to Purchase the things from other company 


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;



public class Purchase extends javax.swing.JFrame {
    int z;
 ResultSet rs,rss;
 Vector id;
 Vector ppl;
        
       public void invoiceid(){
          
           try{
               Connection con = DBConnection.getConn();
               Statement s= con.createStatement();
               rss=s.executeQuery("select MAX(invno) from purchase");
               rss.next();
               rss.getString("MAX(invno)");
               if(rss.getString("MAX(invno)") == null){
                   invno.setText("0000001");
               }
               else{
                   long id = Long.parseLong(rss.getString("MAX(invno)").substring(0,rss.getString("MAX(invno)").length()));
                   id++;
                   invno.setText(""+String.format("%07d",id));
               }
               
           }catch(Exception ee)
           {
               System.out.println("Invno  exception in this code"+ee);
           }
       }
 
    void Pitm()
    {
        try{
                Connection con = DBConnection.getConn();
                Statement stm = con.createStatement ();
                rs= stm.executeQuery("Select * from item");
                id=new Vector();
                ppl = new Vector();
                while (rs.next())
                {
                    id.addElement(rs.getInt(1));
                    itm.addItem(rs.getString(2));
                    ppl.addElement (rs.getString(3));
                }
        }catch (Exception ee){
            System.out.println("This is pitm exception"+ee);
        }
    }

  
    public Purchase() {
        initComponents();
       Connection con = DBConnection.getConn();
        Pitm();
        invoiceid();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        purprice = new javax.swing.JTextField();
        invno = new javax.swing.JTextField();
        home = new javax.swing.JButton();
        itm = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        totalbt = new javax.swing.JButton();
        phNo = new javax.swing.JTextField();
        purchase = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Purchase form ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 333, 48));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Item");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 90, 31));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Purchase price");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 90, 31));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("INV.No");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 90, 31));
        getContentPane().add(purprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 151, 31));
        getContentPane().add(invno, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 151, 31));

        home.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        itm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        itm.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                itmItemStateChanged(evt);
            }
        });
        getContentPane().add(itm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 151, 31));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 90, 31));
        getContentPane().add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 151, 31));
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 145, 48));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("City");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 90, 31));

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Mobile No");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 90, 31));

        jLabel8.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Company Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 160, 31));
        getContentPane().add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 151, 31));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 151, 31));

        totalbt.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        totalbt.setText("Total");
        totalbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalbtActionPerformed(evt);
            }
        });
        getContentPane().add(totalbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 135, 48));
        getContentPane().add(phNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 151, 31));

        purchase.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        purchase.setText("Purchase");
        purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseActionPerformed(evt);
            }
        });
        getContentPane().add(purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 226, 70));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desktopaap/balcks.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 690, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
            this.setVisible(false);
            Demoaap.main(new String [2]);
            
    }//GEN-LAST:event_homeActionPerformed

    private void itmItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_itmItemStateChanged
        try{
                int x= itm.getSelectedIndex();
               purprice.setText(ppl.get(x-1)+"");
        }catch (Exception ee)
        {System.out.println(ee+"This exception is under ItemState change");
        }
    }//GEN-LAST:event_itmItemStateChanged

    private void totalbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalbtActionPerformed
        try{
        int    y=Integer.parseInt( purprice.getText());
          z=Integer.parseInt(qty.getText());
            int tot= y*z;
        total.setText(tot+"");
        }catch(Exception ee)
        { System.out.println("Toatal Exception"+ee);
        }
    }//GEN-LAST:event_totalbtActionPerformed

    private void purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseActionPerformed
                Connection con = DBConnection.getConn();
                 String iid=invno.getText();
     try { 
         PreparedStatement stm = con.prepareStatement ("insert into purchase (invno,item,cnm,city,qty,purprice,total) values (?,?,?,?,?,?,?)");

         int raj= itm.getSelectedIndex();
         String s= itm.getItemAt(raj);
         stm.setString(1, iid);
         stm.setString(2,(s));
         stm.setString ( 3,name.getText());
         stm.setString(4,city.getText());
         stm.setInt(5,Integer.parseInt(qty.getText()));
         stm.setInt(6,Integer.parseInt(purprice.getText()));
         stm.setInt(7,Integer.parseInt(total.getText()));

        
      
         stm.executeUpdate();
         invoiceid();
         
         int count=0;
         Statement ss= con.createStatement();
         ResultSet rs= ss.executeQuery("Select * from stock");
         while(rs.next()){
             
             if(rs.getString(3).equals(s)){
                 int r= rs.getInt(1);
                 int y=rs.getInt(2);
                 y+=z;
                 PreparedStatement p = con.prepareStatement("Update stock set qty=? where id=? ");
                 p.setInt(1, y);
                 p.setInt(2,r);
                 p.executeUpdate();
                 p.close();//Closing the connection and its object will be distroyed
                 count=1;
             }
         }
             if(count == 0)
             {
                 PreparedStatement ps1= con.prepareStatement ("Insert into stock (qty,item) values (?,?)");
                 ps1.setInt(1,z);
                 ps1.setString(2, s);
                 ps1.executeUpdate();
                 ps1.close();
               
             }
             
         
         phNo.setText("");
         name.setText("");
         qty.setText("");
         city.setText("");
         total.setText("");
   
     } catch (Exception ee) {
        System.out.println(ee+"This is Purchase Action perform ");
     }
               
    }//GEN-LAST:event_purchaseActionPerformed

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Purchase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField city;
    private javax.swing.JButton home;
    private javax.swing.JTextField invno;
    private javax.swing.JComboBox<String> itm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phNo;
    private javax.swing.JButton purchase;
    private javax.swing.JTextField purprice;
    private javax.swing.JTextField qty;
    private javax.swing.JTextField total;
    private javax.swing.JButton totalbt;
    // End of variables declaration//GEN-END:variables
}
