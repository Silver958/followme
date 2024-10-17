package com.cuzcosieste.followme.responses;

import lombok.Data;

public @Data class LoginResponse {
    private String token;

    private long expiresIn;

    public String getToken() {
        return token;
    }
}
