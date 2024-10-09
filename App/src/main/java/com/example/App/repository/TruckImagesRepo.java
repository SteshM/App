package com.example.App.repository;


import com.example.App.models.Truck;
import com.example.App.models.TruckImages;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TruckImagesRepo extends JpaRepository<TruckImages,Long> {
    public List<TruckImages> findByTruck(Truck truck);

}