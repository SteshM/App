package com.example.App.repository;

import com.example.App.models.DepotOrder;
import com.example.App.models.DepotOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepotOrderItemRepo extends JpaRepository<DepotOrderItem,Long> {
    public List<DepotOrderItem> findByDepotOrder(DepotOrder depotOrder);

}
