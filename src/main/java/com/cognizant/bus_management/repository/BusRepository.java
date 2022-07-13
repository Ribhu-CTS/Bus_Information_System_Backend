package com.cognizant.bus_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.bus_management.entity.BusEntity;

@Repository
public interface BusRepository extends JpaRepository<BusEntity, Long> {
    
}
