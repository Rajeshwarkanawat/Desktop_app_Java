package desktopaap;

// This form is to Purchase the things from other company 


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import static javax.swing.JOptionPane.showMessageDialog;


public class Sales extends javax.swing.JFrame {
    int y,z;
 ResultSet rs,rss;
 ResultSet tss;
 Vector id;
 Vector idi;
 Vector spll;
 Vector spl;
 
    
       public void invoiceid(){
          
           try{
               Connection con = DBConnection.getConn();
               Statement s= con.createStatement();
               rss=s.executeQuery("select MAX(invno) from sales");
               rss.next();
               rss.getString("MAX(invno)");
               if(rss.getString("MAX(invno)") == null){
                   invno.setText("0000001");
               }
               else{
                   long iid = Long.parseLong(rss.getString("MAX(invno)").substring(0,rss.getString("MAX(invno)").length()));
                   iid++;
                   invno.setText(""+String.format("%07d",iid));
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
                spl = new Vector();
                
                while (rs.next())
                {
                    id.addElement(rs.getInt(1));
                    itm.addItem(rs.getString(2));
                    
                    spl.addElement (rs.getString(4));
                }
        }catch (Exception ee){
            System.out.println(ee);
        }
    }
    void Pcusto()
    {
        try{
                Connection con = DBConnection.getConn();
                Statement stm = con.createStatement ();
                tss= stm.executeQuery("Select * from customer");
                idi=new Vector();
                spll = new Vector();
                while (tss.next())
                {
                   idi.addElement(tss.getInt(1));
                    combo.addItem(tss.getString(2));
                    spll.addElement(tss.getString(3));
                }
        }catch (Exception ee){
            System.out.println(ee);
        }
    }


  
    public Sales() {
        initComponents();
        Pitm();
        invoiceid();
        Pcusto();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        saleprice = new javax.swing.JTextField();
        invno = new javax.swing.JTextField();
        home = new javax.swing.JButton();
        combo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        totalbt = new javax.swing.JButton();
        sell = new javax.swing.JButton();
        itm = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sales form ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 333, 48));

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Item");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 90, 31));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sales price");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 90, 31));

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("INV.No");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 90, 31));
        getContentPane().add(saleprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 151, 31));
        getContentPane().add(invno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 151, 31));

        home.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboItemStateChanged(evt);
            }
        });
        getContentPane().add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 151, 31));

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 90, 31));
        getContentPane().add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 151, 31));
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 145, 48));

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("City");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 90, 31));

        jLabel8.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Customer Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, 31));
        getContentPane().add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 151, 31));

        totalbt.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        totalbt.setText("Total");
        totalbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalbtActionPerformed(evt);
            }
        });
        getContentPane().add(totalbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 135, 48));

        sell.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        sell.setText("Sell");
        sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellActionPerformed(evt);
            }
        });
        getContentPane().add(sell, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 226, 70));

        itm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        itm.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                itmItemStateChanged(evt);
            }
        });
        getContentPane().add(itm, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 151, 31));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desktopaap/balcks.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
            this.setVisible(false);
            Demoaap.main(new String [2]);
    }//GEN-LAST:event_homeActionPerformed

    private void comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboItemStateChanged
        try{int y= combo.getSelectedIndex();
            city.setText(spll.get(y-1)+"");
        }catch(Exception ee){
            System.out.println(ee);
        }
    }//GEN-LAST:event_comboItemStateChanged

    private void totalbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalbtActionPerformed
        try{     y=Integer.parseInt( saleprice.getText());
            z=Integer.parseInt(qty.getText());
            int tot= y*z;
        total.setText(tot+"");
        }catch(Exception ee)
        {System.out.println(ee);
        }
    }//GEN-LAST:event_totalbtActionPerformed

    private void sellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellActionPerformed
 Connection con = DBConnection.getConn();
                  String iiid=invno.getText();

     try { 
        String s= (String) itm.getSelectedItem();
        
         PreparedStatement stm = con.prepareStatement ("insert into sales (invno,item,cnm,city,qty,salesprice,total) values (?,?,?,?,?,?,?)");
        int itemcombo= itm.getSelectedIndex();
          
         int customercombo= combo.getSelectedIndex();
         String ss= combo.getItemAt(customercombo);
         stm.setString(1,iiid);
         stm.setString(2,(s));
         stm.setString (3,ss);
         stm.setString(4,city.getText());
         stm.setInt(5,Integer.parseInt(qty.getText()));
         stm.setInt(6,Integer.parseInt(saleprice.getText()));
         stm.setInt(7,Integer.parseInt(total.getText()));
         
         stm.executeUpdate();
         
         invoiceid();
           
         int count=0,n=0;
         Statement sr= con.createStatement();
         ResultSet rs= sr.executeQuery("Select * from stock");
         while(rs.next()){
             if(rs.getString(3).equals(s)){
                 int r= rs.getInt(1);
                 int yy=rs.getInt(2);
                 if(yy>=z){
                 yy-=z;
                 int rr =rs.getInt(1);
                 PreparedStatement p = con.prepareStatement("Update stock set qty=? where id=? ");
                 p.setInt(1, yy);
                 p.setInt(2,rr);
                 p.executeUpdate();
                 count=1;
                 }
             
            else
             {
                 showMessageDialog(this,"Not Sufficient Quantitiy");
                 n=1;
               }
            }
         }   
         if(count==0 && n==0){
             showMessageDialog(this,"Item not present ");
         }

         qty.setText("");
         total.setText("");
         
         
         
         
     } catch (Exception ee) {
        System.out.println(ee);
      }        // TODO add your handling code here:
    }//GEN-LAST:event_sellActionPerformed

    private void itmItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_itmItemStateChanged
        try{
            int x= itm.getSelectedIndex();
            saleprice.setText(spl.get(x-1)+"");
        }catch (Exception ee)
        {System.out.println(ee);
        }
    }//GEN-LAST:event_itmItemStateChanged

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField city;
    private javax.swing.JComboBox<String> combo;
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
    private javax.swing.JTextField qty;
    private javax.swing.JTextField saleprice;
    private javax.swing.JButton sell;
    private javax.swing.JTextField total;
    private javax.swing.JButton totalbt;
    // End of variables declaration//GEN-END:variables
}
