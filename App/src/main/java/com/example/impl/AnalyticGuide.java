package com.example.impl;

import com.example.dto.AnalyticsRequestDto;
import com.example.dto.ExtendedRes;

public interface AnalyticGuide {
    public boolean addCustomer();
    public boolean addOrder(Long depotId);
    public boolean addProduct(Long depotId, int products);
    public boolean addPayment(Long depotId, float amount);
    public ExtendedRes getCustomers(AnalyticsRequestDto analyticsRequestDto);
    public ExtendedRes getOrders(AnalyticsRequestDto analyticsRequestDto);
    public ExtendedRes getProducts(AnalyticsRequestDto analyticsRequestDto);
    public ExtendedRes getPayments(AnalyticsRequestDto analyticsRequestDto);

}