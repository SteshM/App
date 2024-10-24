package com.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemDepot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;;
    private Long productId;
    private Long orderId;
    private int quantity;


}