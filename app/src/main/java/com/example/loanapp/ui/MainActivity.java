package com.example.loanapp.ui;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.loanapp.adapter.TabAdapter;
import com.example.loanapp.databinding.ActivityMainBinding;
import com.example.loanapp.model.LoanResponse;
import com.example.loanapp.model.LoginResponse;
import com.example.loanapp.viewmodel.MyViewModel;
import com.google.android.material.tabs.TabLayout;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private MyViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        viewModel = new ViewModelProvider(this).get(MyViewModel.class);
        callLogin();
    }

    private void callLogin() {
        viewModel.callLogin().observe(this,new Observer<LoginResponse>(){
            @Override
            public void onChanged(LoginResponse data) {
                callLoanDetails(data);
            }
        });
    }

    private void callLoanDetails(LoginResponse data) {
        viewModel.callLoanDetails("Bearer "+data.token,data.data.userType).observe(this,new Observer<LoanResponse>(){
            @Override
            public void onChanged(LoanResponse data) {
                loadFragment(data);
            }
        });
    }

    private void loadFragment(LoanResponse data){
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Approved"));
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("On-going"));
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Rejected"));
        binding.tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final TabAdapter adapter = new TabAdapter(this,getSupportFragmentManager(), binding.tabLayout.getTabCount(),data);
        binding.viewPager.setAdapter(adapter);

        binding.viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tabLayout));

        binding.tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                binding.viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

}
