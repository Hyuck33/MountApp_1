package com.example.mountapp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JoinRequestDto {
    private String username;
    private String password;
    private String nickname;
    private String email;
    private String phone;
    private String birthdate;
    private String gender;
}