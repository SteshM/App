package com.example.App.repository;

import com.example.App.models.TruckMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TruckMaintenanceRepo extends JpaRepository<TruckMaintenance,Long> {
}
