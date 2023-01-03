package datamahasiswa;

public class ModelMaha {
    private String npm;
    private String nama;
    private String kelas;
    private boolean jeniskel;
    
    public boolean isJeniskel() {
        return jeniskel;
    }
    
    public void setJeniskel(boolean jeniskel) {
        this.jeniskel = jeniskel;
    }
    
    public String getKelas() {
        return kelas;
    }
    
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public String getNpm() {
        return npm;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public ModelMaha(String npm, String nama, String kelas, boolean jeniskel) {
        this.npm = npm;
        this.nama = nama;
        this.kelas = kelas;
        this.jeniskel = jeniskel;
    }
}
