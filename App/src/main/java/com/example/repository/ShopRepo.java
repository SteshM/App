package com.example.repository;

import com.example.models.MyUser;
import com.example.models.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShopRepo extends JpaRepository<Shop,Long> {
    public List<Shop> findByMyUser(MyUser retailer);
    public Shop findByShopIdAndMyUser(Long shopId, MyUser retailer);
    public List<Shop> findByMyUserAndSoftDelete(MyUser retailer, boolean b);
}