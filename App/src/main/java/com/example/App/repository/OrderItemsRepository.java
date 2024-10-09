package com.example.App.repository;

import com.example.App.models.Order;
import com.example.App.models.OrderItem;
import com.example.App.models.QuantityAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemsRepository extends JpaRepository<OrderItem,Long> {
    public List<OrderItem> findByOrder(Order order);
    public List<OrderItem> findByOrderAndQuantityAttribute(Order order, QuantityAttribute quantityAttribute);
    public Integer countByOrder(Order order);
}