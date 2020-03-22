package InputMahasiswa;

import Database.conek;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Tablemhssemua {

    private final DefaultTableModel model;

    public Tablemhssemua(JTable apa){ 
        model = new DefaultTableModel ( );
        apa.setModel(model);
        model.addColumn("NIM");
        model.addColumn("Nama");
   
    }
    
    public final void getData( ){
        try{
            Statement stat = (Statement) conek.GetConnection().createStatement( );
            String sql        = "select * from mahasiswa";
            ResultSet res   = stat.executeQuery(sql);
            while(res.next ()){
                Object[ ] obj = new Object[2];
                obj[0] = res.getString("NIM"); 
                obj[1] = res.getString("Nama");
     
                model.addRow(obj);
            }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    } 
    public final void getCari(String key ){
    
        try{
            Statement stat = (Statement) conek.GetConnection().createStatement( );
            String sql        = "SELECT * FROM mahasiswa WHERE nama LIKE '%"+key+"%'"
                + "OR nim LIKE '%"+key+"%' ;";
            ResultSet res   = stat.executeQuery(sql);

            while(res.next ()){
                Object[ ] obj = new Object[2];
                obj[0] = res.getString("NIM"); 
                obj[1] = res.getString("Nama");

                model.addRow(obj);
            }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    } 
    
    public final void getHapus(String key ){
    
        try{
            Statement stat = (Statement) conek.GetConnection().createStatement( );
            String sql     = "DELETE FROM mahasiswa WHERE nim = '"+key+"';";
            stat.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diihapus");
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    } 
    public final void getUpdate(String nama,String nim){
        try{
            
            String sql = "UPDATE mahasiswa SET nama = '"+nama+"' where nim = '"+nim+"';";
            java.sql.Connection conn = (Connection)conek.GetConnection();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");

        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    } 
   
}
