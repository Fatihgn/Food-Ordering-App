package com.example.loginpageveyemeksipariiuygulamas;

import java.io.Serializable;

public class Yemekler implements Serializable {
    private int logo;
    private String dukkan,telefon,fiyat,yildiz;
    private String sepeteekle;





    public Yemekler(int logo, String dukkan, String telefon, String fiyat, String yildiz) {
        this.logo = logo;
        this.dukkan = dukkan;
        this.telefon = telefon;
        this.fiyat = fiyat;
        this.yildiz = yildiz;
    }

    public String getSepeteekle() {
        return sepeteekle;
    }

    public void setSepeteekle(String sepeteekle) {
        this.sepeteekle = sepeteekle;
    }

    public int getLogo() {
        return logo;
    }

    public String getYildiz() {
        return yildiz;
    }

    public void setYildiz(String yildiz) {
        this.yildiz = yildiz;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getDukkan() {
        return dukkan;
    }

    public void setDukkan(String dukkan) {
        this.dukkan = dukkan;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }
}
