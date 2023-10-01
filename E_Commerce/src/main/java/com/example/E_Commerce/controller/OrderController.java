package com.example.E_Commerce.controller;

import com.example.E_Commerce.model.ProductOrders;
import com.example.E_Commerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("order")
    public String placeOrder(ProductOrders newProductOrders){
        return orderService.placeOrder(newProductOrders);
    }
}
