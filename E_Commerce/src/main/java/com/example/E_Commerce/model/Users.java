package com.example.E_Commerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String  userName;
    private String  userEmail;
    private String  userPassword;
    private String  userPhoneNumber;
}
