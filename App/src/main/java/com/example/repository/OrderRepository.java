package com.example.repository;

import com.example.enums.OrderStatus;
import com.example.models.Depot;
import com.example.models.MyUser;
import com.example.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {
    Order findByDeliveryCode(String code);
    List<Order> findByDriver(MyUser driver);
    List<Order> findByRetailer(MyUser retailer);
    List<Order> findByDepot(Depot depot);
    List<Order> findByStatus(OrderStatus received);
    List<Order> findByDepotAndStatus(Depot depot, OrderStatus dispatched);
}
