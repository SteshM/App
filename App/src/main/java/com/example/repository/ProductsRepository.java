package com.example.repository;


import com.example.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product,Long> {
    public Product findByProductId(Long productId);

}