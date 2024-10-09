package com.example.App.impl;

import com.example.App.dto.ExtendedRes;

public interface DriverGuide {
    public ExtendedRes getMyOrders();

    public ExtendedRes getMyDetails();

    public ExtendedRes myTruck();

    public ExtendedRes getMyInternalOrders();
}
