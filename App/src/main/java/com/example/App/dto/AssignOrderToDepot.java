package com.example.App.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AssignOrderToDepot {

    private Long orderId;
    private Long depotId;
}
