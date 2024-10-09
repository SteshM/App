package com.example.App.repository;

import com.example.App.models.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyUserRepo extends JpaRepository<MyUser,Long> {
    public MyUser findByEmail(String email);

}
