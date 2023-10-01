package com.example.E_Commerce.service;

import com.example.E_Commerce.model.Product;
import com.example.E_Commerce.repo.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    IProductRepo iProductRepo;

    public String addProduct(Product newProduct){
        iProductRepo.save(newProduct);
        return "Product Added";
    }
}
