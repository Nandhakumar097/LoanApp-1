package com.example.loanapp.model;

import java.util.ArrayList;

public class LoanResponse {
    public ArrayList<LoanResponseData> data;

    @Override
    public String toString() {
        return "LoanResponse{" +
                "data=" + data +
                '}';
    }
}
