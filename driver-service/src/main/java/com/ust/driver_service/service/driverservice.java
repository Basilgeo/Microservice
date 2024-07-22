package com.ust.driver_service.service;

import com.ust.driver_service.model.driver;
import com.ust.driver_service.repository.driverrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class driverservice {

    @Autowired
    private driverrepository DriverRepository;

    public List<driver> getAllDrivers() {
        return DriverRepository.findAll();
    }

    public Optional<driver> getDriverById(Long id) {
        return DriverRepository.findById(id);
    }

    public driver createOrUpdateDriver(driver driver) {
        return DriverRepository.save(driver);
    }

    public void deleteDriver(Long id) {
        DriverRepository.deleteById(id);
    }
}
