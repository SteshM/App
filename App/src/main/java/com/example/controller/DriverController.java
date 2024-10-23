package com.example.controller;


import com.example.Main.DepotOrderService;
import com.example.Main.OrderService;
import com.example.dto.ConfirmationDto;
import com.example.dto.DepotOrderConfirmDelivery;
import com.example.dto.ExtendedRes;
import com.example.dto.MinimalRes;
import com.example.impl.DriverGuide;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/v1/driver")
@RequiredArgsConstructor
public class DriverController {
    private final OrderService orderService;
    private final DriverGuide driverService;
    private final DepotOrderService depotOrderService;
    @PostMapping("/confirmDelivery")
    public MinimalRes confirmDelivery(@RequestBody ConfirmationDto confirm) {
        return orderService.confirmDelivery(confirm);
    }

    @GetMapping("/myOrders")
    public ExtendedRes getMyOrders(){
        return driverService.getMyOrders();
    }

    @GetMapping("/myDetails")
    public ExtendedRes getMyDetails(){
        return driverService.getMyDetails();
    }

    @GetMapping("/myTruck")
    public ExtendedRes myTruck(){
        return driverService.myTruck();
    }

    @GetMapping("/myInternalOrders")
    public ExtendedRes myInternalOrders(){
        return driverService.getMyInternalOrders();
    }
    @PostMapping("/confirmDepotOrderDelivery")
    public MinimalRes confirmDepotOrderDelivery(@RequestBody DepotOrderConfirmDelivery delivery){
        return depotOrderService.confirmDelivery(delivery);
    }}






