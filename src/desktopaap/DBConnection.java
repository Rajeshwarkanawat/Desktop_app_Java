/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopaap;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Rajeshwar kanawat
 */
public class DBConnection {
    static Connection con;
    public static Connection getConn(){
        
        try{
                
                    Class.forName("com.mysql.jdbc.Driver");// This is to open driver of the connection  
                   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aap", "root","");// This is to stablish connection
             
        }catch(Exception ee)
        {System.out.println(ee+"Data connection");
        }
  return con;
    }
    
}
