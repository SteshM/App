package com.example.App.repository;

import com.example.App.models.Shop;
import com.example.App.models.ShopImages;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShopImagesRepo extends JpaRepository<ShopImages,Long> {
    List<ShopImages> findByShop(Shop shop);

}