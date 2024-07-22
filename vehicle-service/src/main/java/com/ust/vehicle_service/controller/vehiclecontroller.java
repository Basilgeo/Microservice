package com.ust.vehicle_service.controller;

import com.ust.vehicle_service.model.vehicle;
import com.ust.vehicle_service.service.vehicleservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class vehiclecontroller {
    @Autowired
    private vehicleservice vehicleService;
    @GetMapping
    public List<vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @GetMapping("/{id}")
    public vehicle getVehicleById(@PathVariable Long id) {
        return vehicleService.getVehicleById(id)
                .orElseThrow(() -> new RuntimeException("Vehicle not found with id " + id));
    }

    @PostMapping
    public vehicle createVehicle(@RequestBody vehicle vehicle) {
        return vehicleService.createOrUpdateVehicle(vehicle);
    }

    @PutMapping("/{id}")
    public vehicle updateVehicle(@PathVariable Long id, @RequestBody vehicle vehicle) {
        vehicle.setId(id);
        return vehicleService.createOrUpdateVehicle(vehicle);
    }

    @DeleteMapping("/{id}")
    public void deleteVehicle(@PathVariable Long id) {
        vehicleService.deleteVehicle(id);
    }

//    @GetMapping("/{vehicleId}/maintenance-records")
//    public ResponseEntity<List<MaintenanceRecord>> getMaintenanceRecordsByVehicleId(@PathVariable Long vehicleId) {
//        List<MaintenanceRecord> maintenanceRecords = vehicleService.getMaintenanceRecordsByVehicleId(vehicleId);
//        return ResponseEntity.ok(maintenanceRecords);
//    }
//
//    @PostMapping("/{vehicleId}/maintenance-records")
//    public ResponseEntity<MaintenanceRecord> addMaintenanceRecord(
//            @PathVariable Long vehicleId,
//            @RequestBody MaintenanceRecord maintenanceRecord) {
//        MaintenanceRecord createdRecord = vehicleService.addMaintenanceRecord(vehicleId, maintenanceRecord);
//        return ResponseEntity.status(HttpStatus.CREATED).body(createdRecord);
//    }
}


