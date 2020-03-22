package InputNilai;

import InterfacedanAbstract.AmbilData;

public class DaftarNilai extends AmbilData{
    Nilai ITERA;
    String nim;
    
    public DaftarNilai (){
        ITERA= new Nilai();
    }

    public DaftarNilai(String nim,Nilai ITERA) {
        this.nim=nim;
        this.ITERA = ITERA;
    }
    
    @Override
    public boolean validasiData() {
        return (
                !nim.isEmpty()
                );
    }
 
    @Override
    public void setSQL() {
        sql = ("Insert Into Nilai "
                + " Values("
                + "'"+nim+"',"
                + "'"+ITERA.getKode_matkul()+"',"
                + "'0','0','0','0','0','0','0');");    
    }
    
}