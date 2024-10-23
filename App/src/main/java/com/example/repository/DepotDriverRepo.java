package com.example.repository;

import com.example.models.DeportDriver;
import com.example.models.Depot;
import com.example.models.DepotDriver;
import com.example.models.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepotDriverRepo  extends JpaRepository<DeportDriver,Long> {
    DeportDriver findByDriver(MyUser user);
    DepotDriver findByDriverAndDepot(MyUser driver, Depot depot);
}