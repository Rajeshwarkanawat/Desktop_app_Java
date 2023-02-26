package desktopaap;



import desktopaap.DBConnection;
import desktopaap.Demoaap;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Purchasehistory extends javax.swing.JFrame {
Statement stm;
ResultSet rs;

    /**
     * Creates new form Purchasehistory
     */
    public Purchasehistory() {
        initComponents();
        show_user();
    }
    public ArrayList<User> userList(){
        ArrayList<User> usersList = new ArrayList<>();
       try{ Connection con = DBConnection.getConn();
                Statement stm = con.createStatement ();
                String query= "Select * from purchase";
                rs= stm.executeQuery(query);
                User user;
                while(rs.next()){
                    user=new User(rs.getInt("id"),rs.getString("item"),rs.getString("cnm"),rs.getString("city"),rs.getInt("qty"),rs.getInt("purprice"),rs.getInt("total"));
                    usersList.add(user);
                }
        }catch(Exception ee){
            System.out.println(ee);
        }
       return usersList;
    }
    public void show_user(){
        ArrayList<User> list= userList();
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        Object[] row = new Object[7];
        for(int i=0;i<list.size();i++){
            row[0]= list.get(i).getid();
            row[1]= list.get(i).getitem();
            row[2]= list.get(i).getcnm();
            row[3]= list.get(i).getcity();
            row[4]= list.get(i).getqty();
            row[5]= list.get(i).getpurprice();
            row[6]= list.get(i).gettotal();
            model.addRow(row);
            
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        home = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Purchase Report");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, 36));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item", "Company.nm", "City", "Quantity", "Purchase price", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 559, 317));

        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 104, 36));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desktopaap/balcks.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 760, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        this.setVisible(false);
        Demoaap.main(new String [2]);
    }//GEN-LAST:event_homeActionPerformed

 
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Purchasehistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
