package com.example.football.Interface;

import com.example.football.Model.Competition;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface competitionsAPI {

    // https://api.football-data.org/v2/competitions

    @Headers("X-Auth-Token: 161d94ea5ccd478596a33f51876bd457")
    @GET("v2/competitions")
    Call<Competition> getCompetitionsData();

}
