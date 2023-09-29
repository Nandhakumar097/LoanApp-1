package com.example.loanapp.model;

import java.io.Serializable;

public class Data implements Serializable {
    public String _id;
    public String userName;
    public String contactNumber;
    public String dOB;
    public int age;
    public String gender;
    public String fathersName;
    public String mothersName;
    public String doorNumber;
    public String streetName;
    public String village;
    public String taluk;
    public String district;
    public String state;
    public String pinCode;
    public String occupation;
    public String education;
    public String natureOfplace;
    public String residence;
    public String caste;
    public String religion;
    public String bankName;
    public String accountNumber;
    public String ifscCode;
    public String branchName;
    public String panCardNumber;
    public String panCardImage;
    public String aadharCardNumber;
    public String aadharCardImage;
    public String membershipStatus;
    public String userType;
    public String mspId;
    public String fpoId;
    public int __v;

    @Override
    public String toString() {
        return "Data{" +
                "_id='" + _id + '\'' +
                ", userName='" + userName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", dOB='" + dOB + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", mothersName='" + mothersName + '\'' +
                ", doorNumber='" + doorNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", village='" + village + '\'' +
                ", taluk='" + taluk + '\'' +
                ", district='" + district + '\'' +
                ", state='" + state + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", occupation='" + occupation + '\'' +
                ", education='" + education + '\'' +
                ", natureOfplace='" + natureOfplace + '\'' +
                ", residence='" + residence + '\'' +
                ", caste='" + caste + '\'' +
                ", religion='" + religion + '\'' +
                ", bankName='" + bankName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                ", branchName='" + branchName + '\'' +
                ", panCardNumber='" + panCardNumber + '\'' +
                ", panCardImage='" + panCardImage + '\'' +
                ", aadharCardNumber='" + aadharCardNumber + '\'' +
                ", aadharCardImage='" + aadharCardImage + '\'' +
                ", membershipStatus='" + membershipStatus + '\'' +
                ", userType='" + userType + '\'' +
                ", mspId='" + mspId + '\'' +
                ", fpoId='" + fpoId + '\'' +
                ", __v=" + __v +
                '}';
    }
}
