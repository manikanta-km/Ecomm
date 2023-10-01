package com.example.E_Commerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addId;
    private String  addName;
    private String addLandmark;
    private String  addZipCode;
    private String  addPhoneNumber;
    private String  addState;

    @ManyToOne
    @JoinColumn(name = "fk_userId")
    Users users;

}
