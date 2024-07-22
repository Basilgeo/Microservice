package com.ust.vehicle_service.repository;

import com.ust.vehicle_service.model.vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface vehiclerepository extends JpaRepository<vehicle,Long> {
}
