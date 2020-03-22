package Inputmatkul;

import InterfacedanAbstract.AmbilData;

public class Daftarmatkul extends AmbilData{
    matkul ITERA;
    String kode_mk;
    
    public Daftarmatkul (){
        ITERA= new matkul();
    }

  
    public Daftarmatkul (String kode_mk,matkul ITERA) {
      
        this.kode_mk = kode_mk;
        this.ITERA = ITERA;
    }
    
    @Override
    public boolean validasiData() {
        
        return (!kode_mk.isEmpty() &&
                !ITERA.getKode_kls().isEmpty() &&
                !ITERA.getNama_mk().isEmpty() &&
                !ITERA.getHari().isEmpty() &&
                !ITERA.getSks().isEmpty() &&
                !ITERA.getWaktu().isEmpty()
                );
    }
 
    @Override
    public void setSQL() {
        sql = ("Insert Into matakuliah"
                + " Values("
                + "'"+kode_mk+"',"
                + "'"+ITERA.getKode_kls().isEmpty()+"',"
                + "'"+ITERA.getNama_mk().isEmpty()+"',"
                + "'"+ITERA.getSks().isEmpty() +"',"
                + "'"+ITERA.getHari().isEmpty()+"',"
                + "'"+ITERA.getWaktu().isEmpty()+"');");    
    }
    
}