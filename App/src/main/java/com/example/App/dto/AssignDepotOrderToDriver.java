package com.example.App.dto;

import lombok.Data;

@Data
public class AssignDepotOrderToDriver {
    private Long depotId;
    private Long depotOrderId;
    private Long driverId;
}
