package com.example.App.repository;

import com.example.App.enums.OrderStatus;
import com.example.App.models.Depot;
import com.example.App.models.MyUser;
import com.example.App.models.Order;
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
