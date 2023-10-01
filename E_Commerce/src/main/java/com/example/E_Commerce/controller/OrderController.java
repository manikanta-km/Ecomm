package com.example.E_Commerce.controller;

import com.example.E_Commerce.model.ProductOrders;
import com.example.E_Commerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("order")
    public String placeOrder(@RequestBody ProductOrders newProductOrders){
        return orderService.placeOrder(newProductOrders);
    }

    @GetMapping("orderById")
    public List<ProductOrders> getOrderById(@RequestParam Integer id){
        return orderService.getOrderById(id);
    }
}
