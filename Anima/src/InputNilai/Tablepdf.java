package InputNilai;

import Database.conek;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tablepdf {

    private final DefaultTableModel model;

    public Tablepdf(JTable apa){ 
        model = new DefaultTableModel ( );
        apa.setModel(model);
        model.addColumn("NIM");        
        model.addColumn("Tugas");
        model.addColumn("Kuis");
        model.addColumn("Prak");
        model.addColumn("Tubes");
        model.addColumn("UTS");
        model.addColumn("UAS");
        model.addColumn("DLL");
        model.addColumn("NA");
        model.addColumn("Grade");
    }

    public final void getData(String key){
        try{
            Statement stat = (Statement) conek.GetConnection().createStatement( );
            
            String sql= "select nilai.nim,nilai.tugas,nilai.kuis,nilai.praktikum,nilai.tubes,nilai.uts,nilai.uas,"
                    + "nilai.tambahan,na,grade from konversi_na join nilai join mahasiswa join matakuliah where nilai.nim=konversi_na.nim "
                    + "&& nilai.kode_mk=konversi_na.kode_mk && nilai.nim=mahasiswa.nim && nilai.kode_mk=matakuliah.kode_mk"
                    + "&& matakuliah.kode_mk='"+key+"';";
            ResultSet res   = stat.executeQuery(sql);
            while(res.next ()){
                Object[ ] obj = new Object[10];
                obj[0] = res.getString("nilai.nim"); 
                obj[1] = res.getString("nilai.tugas");
                obj[2] = res.getString("nilai.kuis"); 
                obj[3] = res.getString("nilai.praktikum");
                obj[4] = res.getString("nilai.tubes"); 
                obj[5] = res.getString("nilai.uts");
                obj[6] = res.getString("nilai.uas"); 
                obj[7] = res.getString("nilai.tambahan"); 
                obj[8] = res.getString("na"); 
                obj[9] = res.getString("grade"); 
                model.addRow(obj);
            }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    } 
   
}