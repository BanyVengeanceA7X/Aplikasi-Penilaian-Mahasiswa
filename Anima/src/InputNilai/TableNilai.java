package InputNilai;

import Database.conek;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableNilai {

    private final DefaultTableModel model;

    public TableNilai(JTable apa){ 
        model = new DefaultTableModel ( );
        apa.setModel(model);
        model.addColumn("NIM");
        model.addColumn("Nama");
        model.addColumn("Mata Kuliah");
        model.addColumn("Tugas");
        model.addColumn("Kuis");
        model.addColumn("Praktikum");
        model.addColumn("Tubes");
        model.addColumn("UTS");
        model.addColumn("UAS");
        model.addColumn("Tambahan");
        model.addColumn("Nilai Akhir");
        model.addColumn("Grade");
    }
    public final void getData(String key){
        try{
            Statement stat = (Statement) conek.GetConnection().createStatement( );
            
            String sql= "select nilai.nim,nama,nama_mk,nilai.tugas,nilai.kuis,nilai.praktikum,nilai.tubes,nilai.uts,nilai.uas,"
                    + "nilai.tambahan,na,grade from konversi_na join nilai join mahasiswa join matakuliah where nilai.nim=konversi_na.nim "
                    + "&& nilai.kode_mk=konversi_na.kode_mk && nilai.nim=mahasiswa.nim && nilai.kode_mk=matakuliah.kode_mk"
                    + "&& matakuliah.kode_mk='"+key+"';";
            ResultSet res   = stat.executeQuery(sql);
            while(res.next ()){
                Object[ ] obj = new Object[12];
                obj[0] = res.getString("nilai.nim"); 
                obj[1] = res.getString("nama");
                obj[2] = res.getString("nama_mk"); 
                obj[3] = res.getString("nilai.tugas");
                obj[4] = res.getString("nilai.kuis"); 
                obj[5] = res.getString("nilai.praktikum");
                obj[6] = res.getString("nilai.tubes"); 
                obj[7] = res.getString("nilai.uts");
                obj[8] = res.getString("nilai.uas"); 
                obj[9] = res.getString("nilai.tambahan"); 
                obj[10] = res.getString("na"); 
                obj[11] = res.getString("grade"); 
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
    
    public final void getKlik(){
        try{
            
            String sql = "update konversi_na join nilai join komponen set na = (nilai.tugas*komponen.tugas*0.01)+(nilai.kuis*komponen.kuis*0.01)+(nilai.uts*komponen.uts*0.01)+(nilai.uas*komponen.uas*0.01)+(nilai.praktikum*komponen.praktikum*0.01)+(nilai.tambahan*komponen.tambahan*0.01)+(nilai.tubes*komponen.tubes*0.01) where konversi_na.nim=nilai.nim && konversi_na.kode_mk=nilai.kode_mk && konversi_na.kode_mk = komponen.kode_mk;";
            java.sql.Connection conn = (Connection)conek.GetConnection();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
           
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    } 
}