package com.example.E_Commerce.controller;

import com.example.E_Commerce.model.Users;
import com.example.E_Commerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("user")
    public String addUser(Users newUsers){
        return userService.addUser(newUsers);
    }
}
