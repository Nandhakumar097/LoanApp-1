package com.example.loanapp.adapter;

import android.annotation.SuppressLint;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import com.example.loanapp.R;
import com.example.loanapp.model.LoanResponseData;

public class BindingAdapter {

    @androidx.databinding.BindingAdapter("setCustomBackground")
    public static void setCustomBackground(AppCompatTextView textview, String status) {

        if (status.equals("approved")){
            textview.setTextColor(textview.getResources().getColor(R.color.green));
        }

    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @androidx.databinding.BindingAdapter("setCardBackground")
    public static void setCardBackground(CardView cardView, String status) {


        switch (status){
            case "approved" : cardView.setBackground(cardView.getResources().getDrawable(R.drawable.background_card_green)); break;
            case "in-process" : cardView.setBackground(cardView.getResources().getDrawable(R.drawable.background_card_orange)); break;
            case "rejected" : cardView.setBackground(cardView.getResources().getDrawable(R.drawable.background_card_red)); break;
        }

    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @androidx.databinding.BindingAdapter("setAddress")
    public static void setAddress(AppCompatTextView appCompatTextView, LoanResponseData data) {

        String address = data.residence +"\n" +data.street+"\n" +data.taluk+"\n" +data.village+"\n" +data.pinCode;
        appCompatTextView.setText(address);
    }

}
