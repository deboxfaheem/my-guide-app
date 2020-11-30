package com.example.guide.Model;

public class Pending {
    private String tours;
    private String travelers;
    private String tourstarts;
    private String tourends;
    private String language;
    private String time;

    public Pending(String tours,String travelers,String tourstarts,String tourends,String language) {
        this.tours=tours;
        this.travelers=travelers;
        this.tourstarts=tourstarts;
        this.tourends=tourends;
        this.language=language;
    }

    public String getTours() {
        return tours;
    }

    public void setTours(String tours) {
        this.tours = tours;
    }

    public String getTravelers() {
        return travelers;
    }

    public void setTravelers(String travelers) {
        this.travelers = travelers;
    }

    public String getTourstarts() {
        return tourstarts;
    }

    public void setTourstarts(String tourstarts) {
        this.tourstarts = tourstarts;
    }

    public String getTourends() {
        return tourends;
    }

    public void setTourends(String tourends) {
        this.tourends = tourends;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}