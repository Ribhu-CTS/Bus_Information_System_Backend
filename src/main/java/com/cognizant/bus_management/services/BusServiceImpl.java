package com.cognizant.bus_management.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.cognizant.bus_management.entity.BusEntity;
import com.cognizant.bus_management.model.Bus;
import com.cognizant.bus_management.repository.BusRepository;

@Service
public class BusServiceImpl implements BusService {

    private BusRepository busRepository;

    public BusServiceImpl(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    @Override
    public Bus createBus(Bus bus) {
        BusEntity busEntity = new BusEntity();

        BeanUtils.copyProperties(bus, busEntity);
        busRepository.save(busEntity);
        return bus;
    }

    @Override
    public List<Bus> getAllBuses() {
        List<BusEntity> busEntities = busRepository.findAll();

        List<Bus> buses = busEntities
                    .stream()
                    .map(b -> new Bus(
                        b.getId(),
                        b.getBusNumber(),
                        b.getSource(),
                        b.getDestination()))
                    .collect(Collectors.toList());
        return buses;
    }

    @Override
    public boolean deleteBus(long id) {
        BusEntity bus = busRepository.findById(id).get();
        busRepository.delete(bus);
        return true;
    }

    @Override
    public Bus getBusById(long id) {
        BusEntity busEntity = busRepository.findById(id).get();
        Bus bus = new Bus();
        BeanUtils.copyProperties(busEntity, bus);
        return bus;
    }

    @Override
    public Bus updateBus(long id, Bus bus) {
        BusEntity busEntity = busRepository.findById(id).get();
        busEntity.setBusNumber(bus.getBusNumber());
        busEntity.setSource(bus.getSource());
        busEntity.setDestination(bus.getDestination());

        busRepository.save(busEntity);
        return bus;
    }
    
}
