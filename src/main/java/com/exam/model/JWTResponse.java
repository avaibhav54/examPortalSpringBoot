package com.exam.model;

public class JWTResponse {

    String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public JWTResponse() {
    }

    public JWTResponse(String token) {
        this.token = token;
    }
}
