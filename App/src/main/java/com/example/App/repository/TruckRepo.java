package com.example.App.repository;


import com.example.App.models.MyUser;
import com.example.App.models.Truck;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TruckRepo extends JpaRepository<Truck,Long> {
    public Truck findByTruckNo(String TruckNo);

    public Truck findByMyUser(MyUser user);

    public List<Truck> findByMyUserIsNull();
}