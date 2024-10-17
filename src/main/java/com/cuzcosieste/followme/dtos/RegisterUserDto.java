package com.cuzcosieste.followme.dtos;

import lombok.Data;

public @Data class RegisterUserDto {
    private String email;

    private String password;

    private String fullName;

}