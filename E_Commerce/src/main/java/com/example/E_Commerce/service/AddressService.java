package com.example.E_Commerce.service;

import com.example.E_Commerce.model.Address;
import com.example.E_Commerce.repo.IAddressRepo;
import com.example.E_Commerce.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    @Autowired
    IUserRepo iUserRepo;

    public String saveAddress(Address newAddress) {

        addressRepo.save(newAddress);
        return "Address Added";
    }
}
