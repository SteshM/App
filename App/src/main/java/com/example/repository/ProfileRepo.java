package com.example.repository;


import com.example.models.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepo extends JpaRepository<Profile,Long> {
    Profile findByProfileName(String profileName);

}