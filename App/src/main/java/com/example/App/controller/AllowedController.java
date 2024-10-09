package com.example.App.controller;


import com.example.App.Main.OrderInterface;
import com.example.App.dto.ExtendedRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("v1/allowed/")
public class AllowedController {
    @Autowired
    OrderInterface orderServices;

    @GetMapping("/getOrderDetails/{orderId}")
    public ExtendedRes getOrderDetails(@PathVariable Long orderId){
        return orderServices.getOrderItemDetails(orderId);
    }
}