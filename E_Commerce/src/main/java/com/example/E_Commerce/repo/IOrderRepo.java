package com.example.E_Commerce.repo;

import com.example.E_Commerce.model.ProductOrders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends JpaRepository<ProductOrders,Integer> {
}
