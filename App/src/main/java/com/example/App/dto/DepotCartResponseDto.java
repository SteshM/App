package com.example.App.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepotCartResponseDto {
    private Long productId;
    private Long qAttId;
    private int quantity;
}
