package Inputmatkul;

public class komponen {
   
    private String kode_mk;
    private String kode_kls;
    private String nama_mk;
    private String sks;
    private String hari;
    private String waktu;

    public komponen(String kode_kls, String nama_mk, String sks, String hari, String waktu) {
        this.kode_kls = kode_kls;
        this.nama_mk = nama_mk;
        this.sks = sks;
        this.hari = hari;
        this.waktu = waktu;
    }
   
    komponen() {
    }

    public String getKode_kls() {
        return kode_kls;
    }

    public void setKode_kls(String kode_kls) {
        this.kode_kls = kode_kls;
    }

    public String getNama_mk() {
        return nama_mk;
    }

    public void setNama_mk(String nama_mk) {
        this.nama_mk = nama_mk;
    }

    public String getSks() {
        return sks;
    }

    public void setSks(String sks) {
        this.sks = sks;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

}