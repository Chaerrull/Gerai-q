package com.app.chaerrull.geraiq.model;
import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;

@IgnoreExtraProperties
public class Requests implements Serializable{

    private String Nama;
    private String Alamat;
    private String Web;

    private String key;

    public Requests(){

    }

    public Requests(String Nama, String Alamat, String Web) {
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Web = Web;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        this.Alamat = alamat;
    }

    public String getWeb() {
        return Web;
    }

    public void setWeb(String web) {
        this.Web = web;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return " "+ Nama +"\n" +
                " "+ Alamat +"\n" +
                " "+ Web;
    }

}