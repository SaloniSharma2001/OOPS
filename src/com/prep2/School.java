package com.prep2;

public class School {
    School(){

    }
    School(String sName, int sCode, String address){
        this.sName = sName;
        this.sCode = sCode;
        this.address = address;

    }

    String sName;
    int sCode;
    String address;
    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsCode() {
        return sCode;
    }

    public void setsCode(int sCode) {
        this.sCode = sCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
