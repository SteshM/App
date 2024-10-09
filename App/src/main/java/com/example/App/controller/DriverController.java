package com.example.App.controller;


import com.example.App.Main.DepotOrderService;
import com.example.App.Main.OrderService;
import com.example.App.dto.ConfirmationDto;
import com.example.App.dto.DepotOrderConfirmDelivery;
import com.example.App.dto.ExtendedRes;
import com.example.App.dto.MinimalRes;
import com.example.App.impl.DriverGuide;
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






