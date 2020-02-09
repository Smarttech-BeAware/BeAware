package com.project.beaware.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Crime {
    @SerializedName("drugTrafficking")
    @Expose
    private int drugTrafficking;
    @SerializedName("humanTrafficking")
    @Expose
    private int humanTrafficking;
    @SerializedName("fraud")
    @Expose
    private int fraud;
    @SerializedName("kidnapping")
    @Expose
    private int kidnapping;
    @SerializedName("wildlifePoaching")
    @Expose
    private int wildlifePoaching;
    @SerializedName("sexualHarassment")
    @Expose
    private int sexualHarassment;
    @SerializedName("illegalTrade")
    @Expose
    private int illegalTrade;
    @SerializedName("others")
    private int others;
    @SerializedName("northCentral")
    @Expose
    private int northCentral;
    @SerializedName("northWest")
    @Expose
    private int northWest;
    @SerializedName("northEast")
    @Expose
    private int northEast;
    @SerializedName("southSouth")
    @Expose
    private int southSouth;
    @SerializedName("southEast")
    @Expose
    private int southEast;
    @SerializedName("southWest")
    @Expose
    private int southWest;

    public Crime(int drugTrafficking, int humanTrafficking, int fraud, int kidnapping, int wildlifePoaching,
                 int sexualHarassment, int illegalTrade, int others){
        this.drugTrafficking = drugTrafficking;
        this.humanTrafficking = humanTrafficking;
        this.fraud = fraud;
        this.kidnapping = kidnapping;
        this.wildlifePoaching = wildlifePoaching;
        this.sexualHarassment = sexualHarassment;
        this.illegalTrade = illegalTrade;
        this.others = others;
    }

    public int getDrugTrafficking() {
        return drugTrafficking;
    }

    public void setDrugTrafficking(int drugTrafficking) {
        this.drugTrafficking = drugTrafficking;
    }

    public int getHumanTrafficking() {
        return humanTrafficking;
    }

    public void setHumanTrafficking(int humanTrafficking) {
        this.humanTrafficking = humanTrafficking;
    }

    public int getFraud() {
        return fraud;
    }

    public void setFraud(int fraud) {
        this.fraud = fraud;
    }

    public int getKidnapping() {
        return kidnapping;
    }

    public void setKidnapping(int kidnapping) {
        this.kidnapping = kidnapping;
    }

    public int getWildlifePoaching() {
        return wildlifePoaching;
    }

    public void setWildlifePoaching(int wildlifePoaching) {
        this.wildlifePoaching = wildlifePoaching;
    }

    public int getSexualHarassment() {
        return sexualHarassment;
    }

    public void setSexualHarassment(int sexualHarassment) {
        this.sexualHarassment = sexualHarassment;
    }

    public int getIllegalTrade() {
        return illegalTrade;
    }

    public void setIllegalTrade(int illegalTrade) {
        this.illegalTrade = illegalTrade;
    }

    public int getOthers() {
        return others;
    }

    public void setOthers(int others) {
        this.others = others;
    }

    public int getNorthCentral() {
        return northCentral;
    }

    public void setNorthCentral(int northCentral) {
        this.northCentral = northCentral;
    }

    public int getNorthWest() {
        return northWest;
    }

    public void setNorthWest(int northWest) {
        this.northWest = northWest;
    }

    public int getNorthEast() {
        return northEast;
    }

    public void setNorthEast(int northEast) {
        this.northEast = northEast;
    }

    public int getSouthSouth() {
        return southSouth;
    }

    public void setSouthSouth(int southSouth) {
        this.southSouth = southSouth;
    }

    public int getSouthEast() {
        return southEast;
    }

    public void setSouthEast(int southEast) {
        this.southEast = southEast;
    }

    public int getSouthWest() {
        return southWest;
    }

    public void setSouthWest(int southWest) {
        this.southWest = southWest;
    }
}
