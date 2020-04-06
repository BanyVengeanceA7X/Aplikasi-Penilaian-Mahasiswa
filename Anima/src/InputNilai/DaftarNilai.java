package InputNilai;

import Database.Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaftarNilai {
    Nilai ITERA;
    String nim;
    protected String sql,sql2;
    private final Connection Koneksi=new Koneksi().getKoneksi();
    private ResultSet  rs;
    private Statement st,st2;
    public DaftarNilai (){
        ITERA= new Nilai();
    }

    public DaftarNilai(String nim,Nilai ITERA) {
        this.nim=nim;
        this.ITERA = ITERA;
    }
 
    public boolean validasiData() {
        return (
            !nim.isEmpty()
        );
    }
   
    public void setSQL1() {
        sql = ("Insert Into Nilai "
                + " Values("
                + "'"+nim+"',"
                + "'"+ITERA.getKode_matkul()+"',"
                + "'0','0','0','0','0','0','0');");    
    }
    public void setSQL2() {       
        sql2 = ("Insert Into konversi_na "
                + " values("
                + "'"+nim+"',"
                + "'"+ITERA.getKode_matkul()+"',"
                + "'0','');");    
    }
    public int getDaftar1(){
        setSQL1();
        try {
            st = Koneksi.createStatement();
            st.executeUpdate(sql);
            return 0;
        } catch (SQLException ex){}
        return -1;
   }
    public int getDaftar2(){
        setSQL2();
        try {
            st2 = Koneksi.createStatement();
            st2.executeUpdate(sql2);
            return 0;
        } catch (SQLException ex){}
        return -1;
   }
}//update konversi_na join nilai join komponen set na = (nilai.tugas*komponen.tugas*0.01)+(nilai.kuis*komponen.kuis*0.01)+(nilai.uts*komponen.uts*0.01)+(nilai.uas*komponen.uas*0.01)+(nilai.praktikum*komponen.praktikum*0.01)+(nilai.tambahan*komponen.tambahan*0.01)+(nilai.tubes*komponen.tubes*0.01) where konversi_na.nim=nilai.nim && konversi_na.kode_mk=nilai.kode_mk && konversi_na.kode_mk = komponen.kode_mk;
//select nilai.nim,nama,nama_mk,nilai.tugas,nilai.kuis,nilai.praktikum,nilai.tubes,nilai.uts,nilai.uas,nilai.tambahan,na,grade from konversi_na join nilai join mahasiswa join matakuliah where nilai.nim=konversi_na.nim && nilai.kode_mk=konversi_na.kode_mk && nilai.nim=mahasiswa.nim && nilai.kode_mk=matakuliah.kode_mk;