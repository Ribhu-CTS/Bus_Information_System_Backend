package com.cognizant.bus_management.entity;

import javax.persistence.*;


import lombok.Data;

@Entity
@Data
@Table(name = "buses")
public class BusEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long busNumber;
    private String source;
    private String destination;
}
