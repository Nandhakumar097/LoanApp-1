package com.example.loanapp.model;

public class FarmerWindowRepaymentStructure {
    public int balance;
    public boolean completed;
    public int emi;
    public int id;
    public int paidAmount;
    public String paymentDate;
    public String repaymentDate;

    @Override
    public String toString() {
        return "FarmerWindowRepaymentStructure{" +
                "balance=" + balance +
                ", completed=" + completed +
                ", emi=" + emi +
                ", id=" + id +
                ", paidAmount=" + paidAmount +
                ", paymentDate='" + paymentDate + '\'' +
                ", repaymentDate='" + repaymentDate + '\'' +
                '}';
    }
}
