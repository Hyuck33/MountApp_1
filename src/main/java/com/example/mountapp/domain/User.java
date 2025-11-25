package com.example.mountapp.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @SequenceGenerator(
            name = "user_seq",
            sequenceName = "USER_ID_SEQ",
            allocationSize = 1
    )
    private Long id; // 사용자 고유 ID

    @Column(name = "USERNAME", unique = true, nullable = false)
    private String username; // 로그인 ID (유니크)

    @Column(name = "PASSWORD", nullable = false)
    private String password; // 암호화된 비밀번호

    @Column(name = "NICKNAME", unique = true, nullable = false)
    private String nickname; // 닉네임 (유니크)

    @Column(name = "EMAIL")
    private String email;


    @Column(name = "PHONE")
    private String phone;

    @Column(name = "BIRTHDATE")
    private String birthdate;

    @Column(name = "GENDER")
    private String gender;


}