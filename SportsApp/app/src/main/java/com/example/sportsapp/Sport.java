package com.example.sportsapp;

public class Sport {
    private String sportName;
    private int sportImg;

    public Sport(String sportName, int sportImg) {
        this.sportName = sportName;
        this.sportImg = sportImg;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public void setSportImg(int sportImg) {
        this.sportImg = sportImg;
    }

    public String getSportName() {
        return sportName;
    }

    public int getSportImg() {
        return sportImg;
    }
}