package com.example.impl;

import com.example.dto.ExtendedRes;

public interface DriverGuide {
    public ExtendedRes getMyOrders();

    public ExtendedRes getMyDetails();

    public ExtendedRes myTruck();

    public ExtendedRes getMyInternalOrders();
}
