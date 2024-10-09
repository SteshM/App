package com.example.App.repository;

import com.example.App.dto.DriverDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DriverDtoRepo extends JpaRepository<DriverDto, Long> {
    @Query(value = "select * from get_driver_by_email(?1, ?2)", nativeQuery = true)
    public DriverDto getDriverWithEmailAndSoftDelete(String email, boolean softDelete);

}
