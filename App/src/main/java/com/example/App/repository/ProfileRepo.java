package com.example.App.repository;


import com.example.App.models.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepo extends JpaRepository<Profile,Long> {
    Profile findByProfileName(String profileName);

}