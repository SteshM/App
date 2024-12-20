package com.example.repository;


import com.example.models.Depot;
import com.example.models.DepotAdmin;
import com.example.models.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepotAdminRepo extends JpaRepository<DepotAdmin,Long> {
    public List<DepotAdmin> findByMyUser(MyUser admin);
    public DepotAdmin findByMyUserAndDepot(MyUser admin, Depot depot);
    public List<DepotAdmin> findByDepot(Depot depot);

}
