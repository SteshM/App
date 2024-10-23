package com.example.models;

import jakarta.persistence.*;
import lombok.Data;

    @Data
    @Entity
    public class DeportDriver {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @ManyToOne
        @JoinColumn(name = "driverId")
        private MyUser driver;
        @ManyToOne
        @JoinColumn(name = "depotDepotId")
        private Depot depot;

    }

