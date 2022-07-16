package com.example.collectionclass2072042mosesmarzukisamosir.model;

public class Mahasiswa {
    @Override
    public String toString() {
        return getNrp();
    }

    private String nrp;
    private String nama;
    private String nilai_ipa;
    private String nilai_ips;



    public String getNilai_ipa() {
        return nilai_ipa;
    }

    public void setNilai_ipa(String nilai_ipa) {
        this.nilai_ipa = nilai_ipa;
    }

    public String getNilai_ips() {
        return nilai_ips;
    }
    public void setNilai_ips(String nilai_ips) {
        this.nilai_ips = nilai_ips;
    }

    public Mahasiswa(String nrp, String nama, String nilai_ipa, String nilai_ips) {
        this.nrp = nrp;
        this.nama = nama;
        this.nilai_ipa = nilai_ipa;
        this.nilai_ips = nilai_ips;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
