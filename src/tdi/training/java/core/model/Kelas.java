package src.tdi.training.java.core.model;

public class Kelas{
    private String nama;
    private Integer tahunAjaran;
    private String jurusan;

    public Kelas(String nama, Integer tahunAjaran, String jurusan){
        this.nama = nama;
        this.tahunAjaran = tahunAjaran;
        this.jurusan = jurusan;
    }

    public void setNama(String nama){
        this.nama =  nama;
    }
    public void setTahunAjaran(Integer tahun){
        this.tahunAjaran = tahun;
    }
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    public String getNama(){
        return this.nama;
    }
    public Integer getTahunAJaran(){
        return this.tahunAjaran;
    }
    public String getJurusan(){
        return this.jurusan;
    }
}