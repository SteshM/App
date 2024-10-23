package com.example.repository;

import com.example.models.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory,Long> {
    Inventory findByProductId(Long productId);

    Inventory findByDepotId(Long depotId);
}
