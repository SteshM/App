package com.example.App.dto;

import lombok.Data;

@Data
public class AddAttributeDto {
    private String attrName;
    private Long productId;
    private float price;

}
