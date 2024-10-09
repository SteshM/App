package com.example.App.models;

import com.example.App.enums.OrderStatus;
import com.example.App.utils.DateUtils;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class DepotOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "depotId")
    private Depot depot;
    //changes to driver later
    @ManyToOne
    @JoinColumn(name="userId")
    private MyUser myUser;
    @ManyToOne
    @JoinColumn(name = "assignedDepotId")
    private Depot assignedDepot;
    private String orderName;
    private String deliveryCode;
    private OrderStatus status;
    private String orderDate = DateUtils.dateNowString();


}
