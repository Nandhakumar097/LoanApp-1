package com.example.loanapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.loanapp.databinding.ActivityLoanBinding;
import com.example.loanapp.databinding.ActivityMainBinding;
import com.example.loanapp.model.LoanResponse;
import com.example.loanapp.model.LoginResponse;
import com.example.loanapp.viewmodel.MyViewModel;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class LoanActivity extends AppCompatActivity {

    private ActivityLoanBinding binding;

    private MyViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoanBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();

        LoginResponse loginResponse =
                (LoginResponse) bundle.getSerializable("value");
        viewModel = new ViewModelProvider(this).get(MyViewModel.class);
        viewModel.callLoanDetails("Bearer " + loginResponse.token, loginResponse.data.userType).observe(this, new Observer<LoanResponse>() {
            @Override
            public void onChanged(LoanResponse data) {
            }
        });
    }

}
