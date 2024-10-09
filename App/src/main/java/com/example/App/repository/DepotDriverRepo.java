package com.example.App.repository;

import com.example.App.models.DeportDriver;
import com.example.App.models.Depot;
import com.example.App.models.DepotDriver;
import com.example.App.models.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepotDriverRepo  extends JpaRepository<DeportDriver,Long> {
    DeportDriver findByDriver(MyUser user);
    DepotDriver findByDriverAndDepot(MyUser driver, Depot depot);
}