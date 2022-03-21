package com.example.football.Model;

public class CurrentSeason {

    private String startDate;
    private String endDate;
    private String currentMatchday;

    public CurrentSeason(String startDate, String endDate, String currentMatchday) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.currentMatchday = currentMatchday;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCurrentMatchday() {
        return currentMatchday;
    }

    public void setCurrentMatchday(String currentMatchday) {
        this.currentMatchday = currentMatchday;
    }
}
