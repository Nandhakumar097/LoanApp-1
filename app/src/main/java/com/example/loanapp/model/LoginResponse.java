package com.example.loanapp.model;


import java.io.Serializable;

public class LoginResponse implements Serializable {
    public Data data;
    public String token = "";

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
