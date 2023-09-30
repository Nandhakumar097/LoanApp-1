package com.example.loanapp;

import androidx.lifecycle.MutableLiveData;

import com.example.loanapp.model.LoanResponse;
import com.example.loanapp.model.LoginResponse;


public interface MyRepository {


    MutableLiveData<LoginResponse> loginCall();
    MutableLiveData<LoanResponse> callLoanDetails(String token, String type);
}
