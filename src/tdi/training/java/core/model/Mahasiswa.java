package src.tdi.training.java.core.model;

import java.time.LocalDate;

import src.tdi.training.java.core.model.Kelas;

public class Mahasiswa{
    private String nama, nim;
    private LocalDate tanggallahir;
    private Integer angkatan;
    private Kelas kelas;

    public Mahasiswa(String nama, String nim, LocalDate tanggal, Integer angkatan, Kelas kelas){
        this.nama = nama;
        this.nim = nim;
        this.tanggallahir = tanggal;
        this.angkatan = angkatan;
        this.kelas = kelas;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setAngkatan(Integer angkatan){
        this.angkatan = angkatan;
    }
    public void setKelas(Kelas kelas){
        this.kelas = kelas;
    }
    public void setTanggalLahir(LocalDate tanggal){
        this.tanggallahir = tanggal;
    }
    public String getNama(){
        return this.nama;
    }
    public String getNim(){
        return this.nim;
    }
    public Integer getAngkatan(){
        return this.angkatan;
    }
    public Kelas getKelas(){
        return kelas;
    }
    public LocalDate getTanggalLahir(){
        return tanggallahir;
    }
    public String toString(){
        return String.format("%s \t| %s \t| %s \t| %s \t| %s \t| %s", 
        this.getNim(), this.getNama(), this.getTanggalLahir(), this.getAngkatan(), this.getKelas().getNama(), this.getKelas().getJurusan());
    }
}