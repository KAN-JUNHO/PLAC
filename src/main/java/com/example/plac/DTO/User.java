package com.example.plac.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String email;
    private String password; // 실제로는 해시된 비밀번호를 저장해야 합니다.
    private String location;

    private String oauth2Provider;
    private String oauth2ProviderId;
    // getters, setters, constructors, and other methods...
}