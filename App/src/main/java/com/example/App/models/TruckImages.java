package com.example.App.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class TruckImages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean cloud;
    private String publicId;
    private String picture;
    @ManyToOne
    @JoinColumn(name = "truckId")
    private Truck truck;
}
