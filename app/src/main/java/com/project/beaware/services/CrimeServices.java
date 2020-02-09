package com.project.beaware.services;

import com.project.beaware.model.Crime;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface CrimeServices {
    @GET("getcrimedata")
    Call<Crime> getCrtimeData(@Query("sortmethod") String sortmethod);
}
