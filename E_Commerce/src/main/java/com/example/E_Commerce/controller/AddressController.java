package com.example.E_Commerce.controller;

import com.example.E_Commerce.model.Address;
import com.example.E_Commerce.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String addAddress(@RequestBody Address newAddress){
        return addressService.saveAddress(newAddress);
    }
}
