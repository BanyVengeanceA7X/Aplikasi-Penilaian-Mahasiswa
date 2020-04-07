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
    public final void getKlik2(){
        try{
            
            String sql = "update konversi_na join index_nilai set grade ='A' where na>index_nilai.A && konversi_na.kode_mk=index_nilai.kode_mk; ";
            String sql2 = "update konversi_na join index_nilai set grade ='AB' where na>index_nilai.AB && na<index_nilai.A && konversi_na.kode_mk=index_nilai.kode_mk; ";
            String sql3 = "update konversi_na join index_nilai set grade ='B' where na>index_nilai.B && na<index_nilai.AB && konversi_na.kode_mk=index_nilai.kode_mk; ";
            String sql4 = "update konversi_na join index_nilai set grade ='BC' where na>index_nilai.BC && na<index_nilai.B && konversi_na.kode_mk=index_nilai.kode_mk; ";
            String sql5 = "update konversi_na join index_nilai set grade ='C' where na>index_nilai.C && na<index_nilai.BC && konversi_na.kode_mk=index_nilai.kode_mk; ";
            String sql6 = "update konversi_na join index_nilai set grade ='D' where na>index_nilai.D && na<index_nilai.C && konversi_na.kode_mk=index_nilai.kode_mk; ";
            String sql7 = "update konversi_na join index_nilai set grade ='E' where na<index_nilai.D && konversi_na.kode_mk=index_nilai.kode_mk; ";
                    
            java.sql.Connection conn = (Connection)conek.GetConnection();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            java.sql.PreparedStatement pst2 = conn.prepareStatement(sql2);
            pst2.execute();
            java.sql.PreparedStatement pst3 = conn.prepareStatement(sql3);
            pst3.execute();
            java.sql.PreparedStatement pst4 = conn.prepareStatement(sql4);
            pst4.execute();
            java.sql.PreparedStatement pst5 = conn.prepareStatement(sql5);
            pst5.execute();
            java.sql.PreparedStatement pst6 = conn.prepareStatement(sql6);
            pst6.execute();
            java.sql.PreparedStatement pst7 = conn.prepareStatement(sql7);
            pst7.execute();
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    } 
}