package com.example.repository;

import com.example.models.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyUserRepo extends JpaRepository<MyUser,Long> {
    public MyUser findByEmail(String email);

}