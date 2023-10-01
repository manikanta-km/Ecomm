package com.example.E_Commerce.service;

import com.example.E_Commerce.model.Users;
import com.example.E_Commerce.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    IUserRepo iUserRepo;

    public String addUser(Users newUsers){
        iUserRepo.save(newUsers);
        return "User Added";
    }
}
