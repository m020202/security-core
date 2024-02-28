package com.example.corespringsecurity.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Account {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private String email;
    private String age;
    private String role;

    public static Account createAcount(String username, String password, String email, String age, String role) {
        Account account = new Account();
        account.username = username;
        account.password = password;
        account.email = email;
        account.age = age;
        account.role = role;

        return account;
    }
}
