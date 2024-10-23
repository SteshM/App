package com.example.repository;

import com.example.models.Order;
import com.example.models.OrderItem;
import com.example.models.QuantityAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemsDepotRepo extends JpaRepository<OrderItem,Long> {
    public List<OrderItem> findByOrder(Order order);
    public List<OrderItem> findByOrderAndQuantityAttribute(Order order, QuantityAttribute quantityAttribute);
    public Integer countByOrder(Order order);
}

