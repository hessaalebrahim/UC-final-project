package com.example.survice;

public class Maids {

    private int maidImg;
    private String maidName;
    private String maidBirth;
    private String maidNat;
    private String maidGen;

    public int getMaidImg() {
        return maidImg;
    }

    public void setMaidImg(int maidImg) {
        this.maidImg = maidImg;
    }

    public String getMaidName() {
        return maidName;
    }

    public void setMaidName(String maidName) {
        this.maidName = maidName;
    }

    public String getMaidBirth() {
        return maidBirth;
    }

    public void setMaidBirth(String maidBirth) {
        this.maidBirth = maidBirth;
    }

    public String getMaidNat() {
        return maidNat;
    }

    public void setMaidNat(String maidNat) {
        this.maidNat = maidNat;
    }

    public String getMaidGen() {
        return maidGen;
    }

    public void setMaidGen(String maidGen) {
        this.maidGen = maidGen;
    }

    public Maids(int maidImg, String maidName, String maidBirth, String maidNat, String maidGen) {
        this.maidImg = maidImg;
        this.maidName = maidName;
        this.maidBirth = maidBirth;
        this.maidNat = maidNat;
        this.maidGen = maidGen;
    }
}
