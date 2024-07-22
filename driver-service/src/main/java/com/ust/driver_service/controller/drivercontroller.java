package com.ust.driver_service.controller;

import com.ust.driver_service.model.driver;
import com.ust.driver_service.service.driverservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/driver")
public class drivercontroller {

    @Autowired
    private driverservice DriverService;

    @GetMapping
    public List<driver> getAllDrivers() {
        return DriverService.getAllDrivers();
    }

    @GetMapping("/{id}")
    public driver getDriverById(@PathVariable Long id) {
        return DriverService.getDriverById(id)
                .orElseThrow(() -> new RuntimeException("Driver not found with id " + id));
    }

    @PostMapping
    public driver createDriver(@RequestBody driver driver) {
        return DriverService.createOrUpdateDriver(driver);
    }

    @PutMapping("/{id}")
    public driver updateDriver(@PathVariable Long id, @RequestBody driver driver) {
        driver.setId(id); // Ensure ID is set for update operation
        return DriverService.createOrUpdateDriver(driver);
    }

    @DeleteMapping("/{id}")
    public void deleteDriver(@PathVariable Long id) {
        DriverService.deleteDriver(id);
    }
}
