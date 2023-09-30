package com.example.loanapp;

import com.example.loanapp.model.LoanResponse;
import com.example.loanapp.model.LoginResponse;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface MyAPI {
    @Headers({
            "Accept: application/json"
    })
    @FormUrlEncoded
    @POST("login")
    Call<LoginResponse> getLogin(@FieldMap Map<String, String> data);



    @Headers({
            "Accept: application/json"
    })
    @GET("loanwindow/loan")
    Call<LoanResponse> getLoanDetails(@Header("Authorization") String authorization, @Query("type") String type);

}

