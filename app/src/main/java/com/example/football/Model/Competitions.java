package com.example.football.Model;

import com.google.gson.annotations.SerializedName;

public class Competitions {

    @SerializedName("name")
    private String name;

    @SerializedName("currentSeason")
    private CurrentSeason currentSeason;

    public Competitions(String name, CurrentSeason currentSeason) {
        this.name = name;
        this.currentSeason = currentSeason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CurrentSeason getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(CurrentSeason currentSeason) {
        this.currentSeason = currentSeason;
    }
}
