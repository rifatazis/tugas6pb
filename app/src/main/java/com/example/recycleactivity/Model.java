package com.example.recycleactivity;

public class Model {
    private String nama,negara,tglLahir,desc;
    private int foto;

    public Model(String nama, String negara, String tglLahir, String desc, int foto) {
        this.nama = nama;
        this.negara = negara;
        this.tglLahir = tglLahir;
        this.desc = desc;
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}

