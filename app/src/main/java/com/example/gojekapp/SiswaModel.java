package com.example.gojekapp;

public class SiswaModel {
    private String nama;
    private String nomerHp;

    public SiswaModel(String nama,String nomerHp ){
        this.nama = nama;
        this.nomerHp = nomerHp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomerHp() {
        return nomerHp;
    }

    public void setNomerHp(String nomerHp) {
        this.nomerHp = nomerHp;
    }




}
