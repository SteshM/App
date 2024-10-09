package com.example.App.repository;


import com.example.App.models.DepotAdmin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepotAdminRepo extends JpaRepository<DepotAdmin,Long> {
    public List<DepotAdmin> findByMyUser(MyUser admin);
    public DepotAdmin findByMyUserAndDepot(MyUser admin, Depot depot);
    public List<DepotAdmin> findByDepot(Depot depot);

}
