package com.example.App.repository;

import com.example.App.models.OrderDepot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDepotRepo extends JpaRepository<OrderDepot,Long> {

}
