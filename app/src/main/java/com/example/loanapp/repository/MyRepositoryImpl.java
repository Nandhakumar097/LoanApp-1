package com.example.loanapp.repository;

import androidx.lifecycle.MutableLiveData;

import com.example.loanapp.MyAPI;
import com.example.loanapp.MyRepository;
import com.example.loanapp.model.LoanResponse;
import com.example.loanapp.model.LoginResponse;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MyRepositoryImpl implements MyRepository {

    @Inject
    MyAPI myAPI;

    @Inject
    public MyRepositoryImpl(MyAPI service) {
        myAPI = service;
    }

    @Override
    public MutableLiveData<LoginResponse> loginCall() {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("userName", "farmer1");
        hashMap.put("password", "123456");
        final MutableLiveData<LoginResponse> loginResponse = new MutableLiveData<>();
        myAPI.getLogin(hashMap).enqueue(new Callback<LoginResponse>() {

            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                loginResponse.postValue(response.body());
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
            }
        });
        return loginResponse;
    }

    @Override
    public MutableLiveData<LoanResponse> callLoanDetails(String token, String type) {
        final MutableLiveData<LoanResponse> loanResponse = new MutableLiveData<>();
        myAPI.getLoanDetails(token, type).enqueue(new Callback<LoanResponse>() {

            @Override
            public void onResponse(Call<LoanResponse> call, Response<LoanResponse> response) {
                loanResponse.postValue(response.body());
            }

            @Override
            public void onFailure(Call<LoanResponse> call, Throwable t) {

            }
        });
        return loanResponse;
    }

}
