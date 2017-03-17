package com.mastermindapps.quakereporter;

public class MainEarthquareData {
    private String ritcher;
    private String place;
    private String date;

    public MainEarthquareData(String ritcher, String place, String date){
        this.ritcher = ritcher;
        this.place = place;
        this.date = date;
    }

    public String getRitcher() {
        return ritcher;
    }

    public String getPlace() {
        return place;
    }

    public String getDate() {
        return date;
    }
}
