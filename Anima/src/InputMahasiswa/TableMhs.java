package InputMahasiswa;

import Database.conek;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TableMhs {

    private final DefaultTableModel model;

    public TableMhs(JTable apa){ 
        model = new DefaultTableModel ( );
        apa.setModel(model);
        model.addColumn("NIM");
        model.addColumn("Nama");
        model.addColumn("Tugas");
        model.addColumn("Kuis");
        model.addColumn("Praktikum");
        model.addColumn("Tubes");
        model.addColumn("UTS");
        model.addColumn("UAS");
        model.addColumn("Tambahan");
    }
    public final void getDataMhs(String key){
        try{
            Statement stat = (Statement) conek.GetConnection().createStatement( );
            String sql= "select mahasiswa.nim,nama,tugas,kuis,praktikum,tubes,uts,uas,tambahan from mahasiswa join nilai WHERE mahasiswa.nim=nilai.nim && "
                    + "mahasiswa.nim=nilai.nim && nilai.kode_mk='"+key+"'";
            ResultSet res   = stat.executeQuery(sql);
            while(res.next ()){
                Object[ ] obj = new Object[9];
                obj[0] = res.getString("mahasiswa.NIM"); 
                obj[1] = res.getString("Nama");
                obj[2] = res.getString("Tugas"); 
                obj[3] = res.getString("Kuis");
                obj[4] = res.getString("Praktikum"); 
                obj[5] = res.getString("Tubes");
                obj[6] = res.getString("UTS"); 
                obj[7] = res.getString("UAS");
                obj[8] = res.getString("Tambahan"); 
                model.addRow(obj);
            }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    } 
    public final void getCari(String key, String mk ){
    
        try{
            Statement stat = (Statement) conek.GetConnection().createStatement( );
            String sql        = "select mahasiswa.nim,nama,tugas,kuis,praktikum,tubes,uts,uas,tambahan from mahasiswa join nilai WHERE mahasiswa.nim=nilai.nim && mahasiswa.nim=nilai.nim &&"
                + "(nilai.nim LIKE '%"+key+"%'"
                + "|| nama LIKE '%"+key+"%')"    
                + "&& nilai.kode_mk LIKE '%"+mk+"%' ;";
            ResultSet res   = stat.executeQuery(sql);

            while(res.next ()){
                Object[ ] obj = new Object[9];
                obj[0] = res.getString("mahasiswa.NIM"); 
                obj[1] = res.getString("Nama");
                obj[2] = res.getString("Tugas"); 
                obj[3] = res.getString("Kuis");
                obj[4] = res.getString("Praktikum"); 
                obj[5] = res.getString("Tubes");
                obj[6] = res.getString("UTS"); 
                obj[7] = res.getString("UAS");
                obj[8] = res.getString("Tambahan"); 
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
    
    public final void getUpdateNilai(String nim,String komponen, String nilai,String key){
        try{
            
            String sql = "UPDATE Nilai SET "+komponen+"= '"+nilai
                    +"' where nim = '"+nim+"'&& kode_mk='"+key+"';";
            java.sql.Connection conn = (Connection)conek.GetConnection();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Nilai Berhasil Dimasukkan");

        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    } 
}