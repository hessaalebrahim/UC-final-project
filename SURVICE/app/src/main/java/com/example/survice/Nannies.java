package com.example.survice;

public class Nannies {

    private int nannyImg;
    private String nannyName;
    private String nannyBirth;
    private String nannyNat;
    private String nannyGen;

    public Nannies(int nannyImg, String nannyName, String nannyBirth, String nannyNat, String nannyGen) {
        this.nannyImg = nannyImg;
        this.nannyName = nannyName;
        this.nannyBirth = nannyBirth;
        this.nannyNat = nannyNat;
        this.nannyGen = nannyGen;
    }

    public int getNannyImg() {
        return nannyImg;
    }

    public void setNannyImg(int nannyImg) {
        this.nannyImg = nannyImg;
    }

    public String getNannyName() {
        return nannyName;
    }

    public void setNannyName(String nannyName) {
        this.nannyName = nannyName;
    }

    public String getNannyBirth() {
        return nannyBirth;
    }

    public void setNannyBirth(String nannyBirth) {
        this.nannyBirth = nannyBirth;
    }

    public String getNannyNat() {
        return nannyNat;
    }

    public void setNannyNat(String nannyNat) {
        this.nannyNat = nannyNat;
    }

    public String getNannyGen() {
        return nannyGen;
    }

    public void setNannyGen(String nannyGen) {
        this.nannyGen = nannyGen;
    }
}
