package com.example.App.repository;


import com.example.App.models.PendingLocalFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PendingLocalFileRepo extends JpaRepository<PendingLocalFile,Long> {
}