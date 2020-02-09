package com.project.beaware.services;

import com.project.beaware.model.Crime;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CrimeServices {
    @GET("getcrimedata")
    Call<Crime> getCrtimeData(@Query("crime") String crime, @Query("location") String location);
}
