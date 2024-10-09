package com.example.App.dto;

import lombok.Data;

import java.util.List;

@Data
public class ImageDeleteDto {
    List<Long> imgIds;
}