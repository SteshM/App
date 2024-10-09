package com.example.App.repository;

import com.example.App.models.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory,Long> {
    Inventory findByProductId(Long productId);

    Inventory findByDepotId(Long depotId);
}
