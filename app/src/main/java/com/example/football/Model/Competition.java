package com.example.football.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Competition {

    @SerializedName("competitions")
    private ArrayList<Competitions> competitions;

    public ArrayList<Competitions> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(ArrayList<Competitions> competitions) {
        this.competitions = competitions;
    }

    public Competition(ArrayList<Competitions> competitions) {
        this.competitions = competitions;
    }
}
