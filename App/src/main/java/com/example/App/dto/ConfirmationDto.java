package com.example.App.dto;

import lombok.Data;

@Data
public class ConfirmationDto {
    private  Long orderId;
    private String confirmationCode;

}
