package jadwalmatkul;

import Database.conek;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class jadwalmatkul {

    private final DefaultTableModel model;

    public jadwalmatkul(JTable apa){ 
        model = new DefaultTableModel ( );
        apa.setModel(model);
        model.addColumn("Hari");
        model.addColumn("Kode Matkul");
        model.addColumn("Mata Kuliah");
        model.addColumn("Ruangan");
        model.addColumn("Kelas");
        model.addColumn("SKS"); 
        model.addColumn("Waktu");
    }
    public final void getData( ){
        try{
            Statement stat = (Statement) conek.GetConnection().createStatement( );
            String sql        = "select hari,kode_mk,nama_mk,ruang,kode_kls,sks,waktu from matakuliah order by field(hari, 'Senin', 'Selasa', 'Rabu', 'Kamis', 'Jumat', 'Sabtu', 'Minggu');";
            ResultSet res   = stat.executeQuery(sql);
            while(res.next ()){
                Object[ ] obj = new Object[7];
                obj[0] = res.getString("hari");
                obj[1] = res.getString("kode_mk"); 
                obj[2] = res.getString("nama_mk"); 
                obj[3] = res.getString("ruang"); 
                obj[4] = res.getString("kode_kls");
                obj[5] = res.getString("sks");
                obj[6] = res.getString("waktu"); 
               
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
    
}
