package com.example.App.repository;


import com.example.App.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product,Long> {
    public Product findByProductId(Long productId);

}