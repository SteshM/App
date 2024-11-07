package com.example.repository;

import com.example.dto.DriverDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface DriverDtoRepo extends JpaRepository<DriverDto, Long> {
    @Query(value = "EXEC get_driver_by_email @param1 = ?1, @param2 = ?2", nativeQuery = true)
    public DriverDto getDriverWithEmailAndSoftDelete(String email, boolean softDelete);

    Optional<DriverDto> findByEmail(String email);


}
