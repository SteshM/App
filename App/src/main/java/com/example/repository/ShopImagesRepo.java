package com.example.repository;

import com.example.models.Shop;
import com.example.models.ShopImages;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShopImagesRepo extends JpaRepository<ShopImages,Long> {
    List<ShopImages> findByShop(Shop shop);

}