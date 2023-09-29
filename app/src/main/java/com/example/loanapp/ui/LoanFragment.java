package com.example.loanapp.ui;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import androidx.fragment.app.Fragment;

import com.example.loanapp.R;
import com.example.loanapp.databinding.ActivityLoanBinding;
import com.example.loanapp.databinding.DetailsPageBinding;
import com.example.loanapp.databinding.RepaymentBinding;
import com.example.loanapp.databinding.ViewPageLoanBinding;
import com.example.loanapp.model.FarmerWindowRepaymentStructure;
import com.example.loanapp.model.LoanResponseData;
import com.squareup.picasso.Picasso;

import java.util.List;

public class LoanFragment extends Fragment {

    List<LoanResponseData> loanResponseData;
    ActivityLoanBinding binding;

    public LoanFragment(List<LoanResponseData> data) {
        loanResponseData = data;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = ActivityLoanBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onResume() {
        super.onResume();

        for (int i = 0; i < loanResponseData.size(); i++) {
            LoanResponseData data = loanResponseData.get(i);
            ViewPageLoanBinding viewPageLoanBinding = ViewPageLoanBinding.inflate(
                    LayoutInflater.from(requireContext()),
                    binding.linearLayout,
                    false
            );
            viewPageLoanBinding.setLoanData(data);
            viewPageLoanBinding.viewRepayment.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    addRepaymentStructure(data, viewPageLoanBinding);
                }
            });

            viewPageLoanBinding.viewDetails.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showDetailWindow(data);
                }
            });

            binding.linearLayout.addView(
                    viewPageLoanBinding.getRoot()
            );
        }


    }

    private void addRepaymentStructure(LoanResponseData data, ViewPageLoanBinding viewPageLoanBinding) {
        if (viewPageLoanBinding.linearLayout.getChildCount() == 0) {
            if (data.farmerWindowRepaymentStructure != null && data.farmerWindowRepaymentStructure.size() > 0)
                for (int j = 0; j < data.farmerWindowRepaymentStructure.size(); j++) {
                    FarmerWindowRepaymentStructure repaymentStructure = data.farmerWindowRepaymentStructure.get(j);
                    RepaymentBinding repaymentBinding = RepaymentBinding.inflate(
                            LayoutInflater.from(requireContext()),
                            viewPageLoanBinding.linearLayout,
                            false
                    );
                    repaymentBinding.setRepayment(repaymentStructure);
                    viewPageLoanBinding.linearLayout.addView(
                            repaymentBinding.getRoot()
                    );

                }
            viewPageLoanBinding.viewRepaymentImage.setBackgroundResource(R.drawable.ic_drop_down);

        } else {
            viewPageLoanBinding.linearLayout.removeAllViews();
            viewPageLoanBinding.viewRepaymentImage.setBackgroundResource(R.drawable.ic_drop_up);
        }
    }

    private void showDetailWindow(LoanResponseData data) {
        View popupView = LayoutInflater.from(getContext()).inflate(R.layout.details_page, null, false);
        DetailsPageBinding pageBinding = DetailsPageBinding.bind(popupView);
        int width = LinearLayout.LayoutParams.MATCH_PARENT;
        int height = LinearLayout.LayoutParams.MATCH_PARENT;
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, true);
        pageBinding.setLoanData(data);
        Picasso.with(getContext()).load(data.panCardImage).into(pageBinding.panImage);
        Picasso.with(getContext()).load(data.aadharCardImage).into(pageBinding.aadharImage);

        pageBinding.close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
            }
        });
        popupWindow.showAtLocation(binding.linearLayout, Gravity.CENTER, 0, 0);

    }
}
