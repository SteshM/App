package com.example.App.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentAnalyticsRepo extends JpaRepository<PaymentAnalytics,Long> {
    public PaymentAnalytics findByDateAndDepotId(int date, Long depotId);
    public List<PaymentAnalytics> findByMonth(int month);
    public List<PaymentAnalytics> findByYear(int year);
}