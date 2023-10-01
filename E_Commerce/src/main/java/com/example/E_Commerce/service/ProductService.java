package com.example.E_Commerce.service;

import com.example.E_Commerce.model.Product;
import com.example.E_Commerce.repo.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductRepo iProductRepo;

    public String addProduct(Product newProduct){
        iProductRepo.save(newProduct);
        return "Product Added";
    }

    public List<Product> getProductsByCategory(String category){
        return iProductRepo.findByProdCategory(category);
    }

    public String deleteProduct(Integer id){
        iProductRepo.deleteById(id);
        return "Product Deleted";
    }
}
