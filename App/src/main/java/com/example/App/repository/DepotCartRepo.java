package com.example.App.repository;

import com.example.App.models.DepotCart;
import com.example.App.models.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepotCartRepo extends JpaRepository<DepotCart,Long> {
    public List<DepotCart> findByAdmin(MyUser admin);
    public DepotCart findByCartIdAndAdmin(Long cartId, MyUser admin);
}
