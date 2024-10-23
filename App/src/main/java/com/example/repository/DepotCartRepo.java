package com.example.repository;

import com.example.models.DepotCart;
import com.example.models.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepotCartRepo extends JpaRepository<DepotCart,Long> {
    public List<DepotCart> findByAdmin(MyUser admin);
    public DepotCart findByCartIdAndAdmin(Long cartId, MyUser admin);
}
