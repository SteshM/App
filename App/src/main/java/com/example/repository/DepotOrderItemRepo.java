package com.example.repository;

import com.example.models.DepotOrder;
import com.example.models.DepotOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepotOrderItemRepo extends JpaRepository<DepotOrderItem,Long> {
    public List<DepotOrderItem> findByDepotOrder(DepotOrder depotOrder);

}
