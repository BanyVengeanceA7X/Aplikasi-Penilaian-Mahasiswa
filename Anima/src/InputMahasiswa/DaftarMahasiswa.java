package InputMahasiswa;

import InterfacedanAbstract.AmbilData;

public class DaftarMahasiswa extends AmbilData{
    Mahasiswa ITERA;
    String kode;
    
    public DaftarMahasiswa (){
        ITERA= new Mahasiswa();
    }

    public DaftarMahasiswa(String kode,Mahasiswa ITERA) {
        this.kode = kode;
        this.ITERA = ITERA;
    }
    
    @Override
    public boolean validasiData() {
        return (!kode.isEmpty() &&
                !ITERA.getNama().isEmpty()
                );
    }
 
    @Override
    public void setSQL() {
        sql = ("Insert Into Mahasiswa"
                + " Values("
                + "'"+kode+"',"
                + "'"+ITERA.getNama()+"');");    
    }
    
}