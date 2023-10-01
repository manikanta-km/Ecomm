package com.example.E_Commerce.controller;

import com.example.E_Commerce.model.Product;
import com.example.E_Commerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("product")
    public String addProduct(Product newProduct){
       return productService.addProduct(newProduct);
    }
}
