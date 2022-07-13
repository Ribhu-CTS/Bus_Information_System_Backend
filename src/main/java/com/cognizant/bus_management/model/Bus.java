package com.cognizant.bus_management.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bus {

    private long id;
    private long busNumber;
    private String source;
    private String destination;
}
