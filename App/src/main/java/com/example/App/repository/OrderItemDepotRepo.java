package com.example.App.repository;

import com.example.App.models.OrderItemDepot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemDepotRepo extends JpaRepository<OrderItemDepot,Long> {
}