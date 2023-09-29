package com.example.loanapp.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class LoanResponseData implements Serializable {

    public String aadharCardImage;
    public String aadharCardNumber;
    public String accountNumber;
    public int age;
    public String bankName;
    public String branchName;
    public String caste;
    public int coApplicantAge;
    public String coApplicantDob;
    public String coApplicantGender;
    public String coApplicantName;
    public Date createdAt;
    public String district;
    public Date dob;
    public String doorNumber;
    public String education;
    public String fatherName;
    public String fpoApprovalStatus;
    public String fpoId;
    public String fpoName;
    public String gender;
    public String id;
    public String ifscCode;
    public Object interest;
    public int intrest;
    public String landHolding;
    public String landHoldingType;
    public String loanFor;
    public String loanId;
    public int loanTenure;
    public String loanWindowId;
    public String mobile;
    public String monthlyHHExpenses;
    public String monthlyHHIncome;
    public String motherName;
    public String name;
    public String natureOfPlace;
    public String occupation;
    public String panCardImage;
    public String panCardNumber;
    public String pinCode;
    public String purpose;
    public String relationship;
    public String religion;
    public int requestedAmount;
    public String residence;
    public String state;
    public String status;
    public String street;
    public String taluk;
    public Object tenure;
    public String userId;
    public String village;
    public String windowId;
    public Date approvalAt;
    public Date fpoApprovalAt;
    public int fpointrest;
    public String reason;
    public ArrayList<FarmerWindowRepaymentStructure> farmerWindowRepaymentStructure;
    public int grantedAmount;
    public String paymentProof;
    public int totalRepayableAmount;

    @Override
    public String toString() {
        return "LoanResponseData{" +
                "aadharCardImage='" + aadharCardImage + '\'' +
                ", aadharCardNumber='" + aadharCardNumber + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", age=" + age +
                ", bankName='" + bankName + '\'' +
                ", branchName='" + branchName + '\'' +
                ", caste='" + caste + '\'' +
                ", coApplicantAge=" + coApplicantAge +
                ", coApplicantDob='" + coApplicantDob + '\'' +
                ", coApplicantGender='" + coApplicantGender + '\'' +
                ", coApplicantName='" + coApplicantName + '\'' +
                ", createdAt=" + createdAt +
                ", district='" + district + '\'' +
                ", dob=" + dob +
                ", doorNumber='" + doorNumber + '\'' +
                ", education='" + education + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", fpoApprovalStatus='" + fpoApprovalStatus + '\'' +
                ", fpoId='" + fpoId + '\'' +
                ", fpoName='" + fpoName + '\'' +
                ", gender='" + gender + '\'' +
                ", id='" + id + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                ", interest=" + interest +
                ", intrest=" + intrest +
                ", landHolding='" + landHolding + '\'' +
                ", landHoldingType='" + landHoldingType + '\'' +
                ", loanFor='" + loanFor + '\'' +
                ", loanId='" + loanId + '\'' +
                ", loanTenure=" + loanTenure +
                ", loanWindowId='" + loanWindowId + '\'' +
                ", mobile='" + mobile + '\'' +
                ", monthlyHHExpenses='" + monthlyHHExpenses + '\'' +
                ", monthlyHHIncome='" + monthlyHHIncome + '\'' +
                ", motherName='" + motherName + '\'' +
                ", name='" + name + '\'' +
                ", natureOfPlace='" + natureOfPlace + '\'' +
                ", occupation='" + occupation + '\'' +
                ", panCardImage='" + panCardImage + '\'' +
                ", panCardNumber='" + panCardNumber + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", purpose='" + purpose + '\'' +
                ", relationship='" + relationship + '\'' +
                ", religion='" + religion + '\'' +
                ", requestedAmount=" + requestedAmount +
                ", residence='" + residence + '\'' +
                ", state='" + state + '\'' +
                ", status='" + status + '\'' +
                ", street='" + street + '\'' +
                ", taluk='" + taluk + '\'' +
                ", tenure=" + tenure +
                ", userId='" + userId + '\'' +
                ", village='" + village + '\'' +
                ", windowId='" + windowId + '\'' +
                ", approvalAt=" + approvalAt +
                ", fpoApprovalAt=" + fpoApprovalAt +
                ", fpointrest=" + fpointrest +
                ", reason='" + reason + '\'' +
                ", farmerWindowRepaymentStructure=" + farmerWindowRepaymentStructure +
                ", grantedAmount=" + grantedAmount +
                ", paymentProof='" + paymentProof + '\'' +
                ", totalRepayableAmount=" + totalRepayableAmount +
                '}';
    }
}
