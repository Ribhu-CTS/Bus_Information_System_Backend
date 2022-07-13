package com.cognizant.bus_management.services;

import java.util.List;

import com.cognizant.bus_management.model.Bus;

public interface BusService {

    Bus createBus(Bus bus);

    List<Bus> getAllBuses();

    boolean deleteBus(long id);

    Bus getBusById(long id);

    Bus updateBus(long id, Bus bus);
    
}
