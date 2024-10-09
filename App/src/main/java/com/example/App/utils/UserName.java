package com.example.App.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserName {
    public static String getUsername(){
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }

}

