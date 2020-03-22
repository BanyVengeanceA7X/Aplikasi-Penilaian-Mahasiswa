/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasekonek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import projectppl.app;

/**
 *
 * @author BANY A7X
 */
public class koneksi extends app{
    public static Connection con;
        public static Connection getKoneksi(){
            String host = "jdbc:mysql://localhost/anima",
                   user = "root",
                   ps   = "";
        try{
            con =(Connection) DriverManager.getConnection(host,user,ps);
            System.out.println("Database dapat digunakan");
            
       }catch(SQLException err){
           JOptionPane.showMessageDialog(null, err.getMessage());
           System.out.println("Gagal");
       }
       return con;
    }
}
