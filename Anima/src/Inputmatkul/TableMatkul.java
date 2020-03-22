package Inputmatkul;

import Database.conek;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TableMatkul {

    private final DefaultTableModel model;


    public TableMatkul(JTable apa){ 
        model = new DefaultTableModel ( );
        apa.setModel(model);
        model.addColumn("Kode Mata Kuliah");
        model.addColumn("Kode Kelas");
        model.addColumn("Nama Mata Kuliah");
        model.addColumn("SKS");
        model.addColumn("Hari"); 
        model.addColumn("Waktu");
    }
    
    public final void getData( ){

        try{
            Statement stat = (Statement) conek.GetConnection().createStatement( );
            String sql        = "Select * from matakuliah";
            ResultSet res   = stat.executeQuery(sql);
            while(res.next ()){
                Object[ ] obj = new Object[6];
                obj[0] = res.getString("kode_mk"); 
                obj[1] = res.getString("kode_kls");
                obj[2] = res.getString("nama_mk"); 
                obj[3] = res.getString("sks");
                obj[4] = res.getString("hari"); 
                obj[5] = res.getString("waktu"); 
               
                model.addRow(obj);
            }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    } 
    public final void getCari(String key ){
    
        try{
            Statement stat = (Statement) conek.GetConnection().createStatement( );
            String sql        = "SELECT * FROM buku natural join rakbuku WHERE  kodebuku LIKE '%"+key+"%'"
                + "OR judulbuku LIKE '%"+key+"%' "
                + "OR pengarang LIKE '%"+key+"%'"
                + "OR penerbit LIKE '%"+key+"%'"
                + "OR tahunterbit LIKE '%"+key+"%' ;";
            ResultSet res   = stat.executeQuery(sql);

            while(res.next ()){
                Object[ ] obj = new Object[8];
                obj[0] = res.getString("kodebuku"); 
                obj[1] = res.getString("judulbuku");
                obj[2] = res.getString("pengarang"); 
                obj[3] = res.getString("penerbit");
                obj[4] = res.getString("tahunterbit"); 
                obj[5] = res.getString("idrak"); 
                obj[6] = res.getString("tipebuku");
                obj[7] = res.getString("jumlahbuku"); 

                model.addRow(obj);
            }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    } 
    
    public final void getHapus(String key ){
    
        try{
            Statement stat = (Statement) conek.GetConnection().createStatement( );
            String sql     = "DELETE FROM buku WHERE kodebuku = '"+key+"';";
            stat.executeUpdate(sql);
 
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    } 
    public final void getUpdate(String kode,String Judul,String Pengarang,String Penerbit,String tahun){
        try{
            
            String sql = "UPDATE buku SET judulbuku= '"+Judul+"',pengarang= '"+Pengarang
                    +"',penerbit= '"+Penerbit+"',tahunterbit= '"+tahun+"' where kodebuku = '"+kode+"';";
            java.sql.Connection conn = (Connection)conek.GetConnection();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "data berhasil di update");

        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    } 
    public final void getMatkul(String kode){
        try{
            String sql = "select nama_mk from matakuliah where kode_mk = '"+kode+"';";
            java.sql.Connection conn = (Connection)conek.GetConnection();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    } 
}
