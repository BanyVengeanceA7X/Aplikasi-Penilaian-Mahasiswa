package Database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Koneksi {
    private static Connection Koneksi;
    Statement st;
    
    public Koneksi(){
        MysqlDataSource mds = new MysqlDataSource();
        mds.setUser("root");
        mds.setPassword("");
        mds.setDatabaseName("anima");
        
        try{
            Koneksi = mds.getConnection();
            st = Koneksi.createStatement();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal "+ex.getMessage());
        }
    }
    public Connection getKoneksi(){
        return this.Koneksi;
    }
    public static void main(String[] args) {
        Koneksi k=new Koneksi();
    }
}
