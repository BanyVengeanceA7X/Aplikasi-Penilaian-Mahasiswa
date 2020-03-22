package InputNilai;

public class Nilai {
    private String kode_matkul;

    public Nilai(String kode_matkul) {
        this.kode_matkul = kode_matkul;
    }

    Nilai() {
    }
    
    public String getKode_matkul() {
        return kode_matkul;
    }

    public void setKode_matkul(String kode_matkul) {
        this.kode_matkul = kode_matkul;
    }
}