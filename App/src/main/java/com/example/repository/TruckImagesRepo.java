package com.example.repository;


import com.example.models.Truck;
import com.example.models.TruckImages;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TruckImagesRepo extends JpaRepository<TruckImages,Long> {
    public List<TruckImages> findByTruck(Truck truck);

}