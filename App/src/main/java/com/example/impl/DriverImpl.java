package com.example.impl;


import com.example.dto.DepotOrderRequest;
import com.example.dto.DriverDto;
import com.example.dto.ExtendedRes;
import com.example.dto.RequestedOrderDto;
import com.example.models.*;
//import com.example.App.repository.*;
import com.example.repository.*;
import com.example.utils.StreamMapper;
import com.example.Service.Components.UserName;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@Slf4j
@Service
public class DriverImpl implements DriverGuide{

    @Autowired
    DriverDtoRepo driverDtoRepo;
    @Autowired
    ProcRepo procRepo;
    @Autowired
    DepotOrderRepo depotOrderRepo;
    @Autowired
    MyUserRepo myUserRepo;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    TruckRepo truckRepo;
    @Autowired
    DepotDriverRepo depotDriverRepo;

    @Override
    public ExtendedRes getMyOrders() {
        MyUser driver = myUserRepo.findByEmail(UserName.getUsername());
        List<Order> orders = orderRepository.findByDriver(driver);
        List<RequestedOrderDto> requestedOrderDtos = orders.stream().map(StreamMapper::getRequestedOrderDtofromOrder).toList();

        return ExtendedRes.builder()
                .status(200)
                .message("List of orders")
                .body(requestedOrderDtos)
                .build();
    }

    @Override
    public ExtendedRes getMyDetails() {
       MyUser driver = myUserRepo.findByEmail(UserName.getUsername());
        log.info("Driver email is : {}",UserName.getUsername());
        if(driver==null){
            return ExtendedRes.builder()
                    .status(400)
                    .message("driver not found")
                    .build();
        }else{
            Truck truck = truckRepo.findByMyUser(driver);
            DeportDriver deportDriver = depotDriverRepo.findByDriver(driver);

            DriverDto driverDto = DriverDto.builder()
                    .driverId(driver.getId())
                    .email(driver.getEmail())
                    .fullName(driver.getFullName())
                    .contact(driver.getContact())
                    .employeeNo(driver.getEmployeeNo())
                    .truckNo(truck.getTruckNo())
                    .depotName(deportDriver.getDepot().getName())
                    .depotId(deportDriver.getId())
                    .createdOn(driver.getCreatedOn())
                    .build();

            return ExtendedRes.builder()
                    .status(200)
                    .message("driver details")
                    .body(driverDto)
                    .build();
        }
    }

    @Override
    public ExtendedRes myTruck() {
        MyUser driver = myUserRepo.findByEmail(UserName.getUsername());
        Truck truck = truckRepo.findByMyUser(driver);
        return ExtendedRes.builder()
                .status(200)
                .message("My Truck details")
                .body(truck)
                .build();
    }

    @Override
    public ExtendedRes getMyInternalOrders() {
        MyUser driver = myUserRepo.findByEmail(UserName.getUsername());
        List<DepotOrder> depotOrders= depotOrderRepo.findByMyUser(driver);
        List<DepotOrderRequest> depotOrderRequests = depotOrders.stream().map(
                StreamMapper::getDepotOrderRequest
        ).toList();
        return ExtendedRes.builder()
                .status(200)
                .message("Internal orders")
                .body(depotOrderRequests)
                .build();
    }


}
