package com.example.repository;

import com.example.models.OrderItemDepot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemDepotRepo extends JpaRepository<OrderItemDepot,Long> {
}