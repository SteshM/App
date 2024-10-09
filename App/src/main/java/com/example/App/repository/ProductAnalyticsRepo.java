package com.example.App.repository;

import com.example.App.models.Analytics.ProductsAnalytics;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductAnalyticsRepo extends JpaRepository<ProductsAnalytics,Long> {
    public ProductsAnalytics findByDate(int date);
    public List<ProductsAnalytics> findByMonth(int month);
    public List<ProductsAnalytics> findByYear(int year);
}