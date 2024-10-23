package com.example.repository;


import com.example.models.DeportDriver;
import com.example.models.Depot;
import com.example.models.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeportDriverRepo extends JpaRepository<DeportDriver,Long> {

    DeportDriver findByDriver(MyUser user);
    DeportDriver findByDriverAndDepot(MyUser driver, Depot depot);
}
