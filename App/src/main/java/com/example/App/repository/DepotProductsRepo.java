package com.example.App.repository;

import com.example.App.models.Depot;
import com.example.App.models.DepotProduct;
import com.example.App.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepotProductsRepo extends JpaRepository<DepotProduct,Long> {
    public DepotProduct findByProductAndQuantityAtAndDepot(Product product , QuantityAttribute quantityAttribute, Depot depot);
    public DepotProduct findByProductAndQuantityAt(Product product , QuantityAttribute quantityAttribute);
    public DepotProduct findByProduct(Product product);
    public List<DepotProduct> findByDepot(Depot depot);
}