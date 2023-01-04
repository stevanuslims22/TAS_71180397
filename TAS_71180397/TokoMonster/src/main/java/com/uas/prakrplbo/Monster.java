package com.uas.prakrplbo;

public abstract class Monster implements MonsterInterface{
    private String nama;

    public Monster(){

    }
    public Monster(String nama){
        this.nama = nama;
    }

    public String bersuara(){
        return null;
    }

    public void getInfo(){
        System.out.println("Nama : " +nama);
        System.out.println("Suara: " +bersuara());
        System.out.println("Gerak : " +bergerak());
    }

    public String getNama() {
        return nama;
    }
}
