package com.example.E_Commerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductOrders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private Integer orderQuantity;

    @ManyToOne
    @JoinColumn(name = "fk_user")
    Users users;

    @ManyToOne
    @JoinColumn(name = "fk_address")
    Address address;

    @ManyToOne
    @JoinColumn(name = "fk_product")
    Product product;

}
