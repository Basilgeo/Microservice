package com.ust.vehicle_service.service;

import com.ust.vehicle_service.model.vehicle;
import com.ust.vehicle_service.repository.vehiclerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class vehicleservice {

    @Autowired
    private vehiclerepository vehicleRepository;
//    @Autowired
//    private MaintenanceServiceClient maintenanceServiceClient;

    public List<vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public Optional<vehicle> getVehicleById(Long id) {
        return vehicleRepository.findById(id);
    }

    public vehicle createOrUpdateVehicle(vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public void deleteVehicle(Long id) {
        vehicleRepository.deleteById(id);
    }

//    public List<MaintenanceRecord> getMaintenanceRecordsByVehicleId(Long vehicleId) {
//        return maintenanceServiceClient.getMaintenanceRecordsByVehicleId(vehicleId);
//    }
//
//    public MaintenanceRecord addMaintenanceRecord(Long vehicleId, MaintenanceRecord maintenanceRecord) {
//        return maintenanceServiceClient.createMaintenanceRecord(vehicleId, maintenanceRecord);
//    }

}
