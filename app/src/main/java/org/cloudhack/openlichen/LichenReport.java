package org.cloudhack.openlichen;

import com.google.gson.Gson;

public class LichenReport {
    private String picture;
    private int linchen;
    private int porcent;
    private int location;


    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getLinchen() {
        return linchen;
    }

    public void setLinchen(int linchen) {
        this.linchen = linchen;
    }

    public int getPorcent() {
        return porcent;
    }

    public void setPorcent(int porcent) {
        this.porcent = porcent;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public String toJson(){
        Gson gson  = new Gson();
        return gson.toJson(this);
    }
}
