package com.example.E_Commerce.service;

import com.example.E_Commerce.model.ProductOrders;
import com.example.E_Commerce.repo.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    IOrderRepo iOrderRepo;

    public String placeOrder(ProductOrders newProductOrders){
        iOrderRepo.save(newProductOrders);
        return "Order Placed";
    }
}
