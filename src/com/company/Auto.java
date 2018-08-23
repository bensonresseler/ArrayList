package com.company;

public class Auto {
    private String bestuurder;
    private String nummerplaat;

    public Auto(String bestuurder, String nummerplaat) {
        this.bestuurder = bestuurder;
        this.nummerplaat = nummerplaat;
    }

    public String getBestuurder() {
        return bestuurder;
    }

    public String getNummerplaat() {
        return nummerplaat;
    }
}
