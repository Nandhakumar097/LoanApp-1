package com.example.loanapp.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.loanapp.MyRepository;
import com.example.loanapp.model.LoanResponse;
import com.example.loanapp.model.LoginResponse;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class MyViewModel extends ViewModel {

    @Inject
    MyRepository myRepository;

    @Inject public MyViewModel(MyRepository repository){
        myRepository = repository;
    }


    public MutableLiveData<LoginResponse> callLogin() {
        return myRepository.loginCall();
    }

    public MutableLiveData<LoanResponse> callLoanDetails(String token, String type) {
        return myRepository.callLoanDetails(token,type);
    }
}
