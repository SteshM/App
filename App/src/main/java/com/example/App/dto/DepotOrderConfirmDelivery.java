package com.example.App.dto;


import lombok.Data;

@Data
public class DepotOrderConfirmDelivery {
    private Long depotOrderId;
    private String deliveryCode;
}