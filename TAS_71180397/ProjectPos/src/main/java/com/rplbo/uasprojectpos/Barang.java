package com.rplbo.uasprojectpos;

public class Barang {
    public Barang(String nama,int stok,long harga){
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    private String kode;
    private int stok;
    private int nextNum;
    private String nama;
    private long harga;

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getKode() {
        return kode;
    }

    public int getStok() {
        return stok;
    }

    public String getNama() {
        return nama;
    }

    public long getHarga() {
        return harga;
    }
}
