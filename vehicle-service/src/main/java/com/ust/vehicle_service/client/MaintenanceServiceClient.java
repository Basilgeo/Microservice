package com.ust.vehicle_service.controller;

import com.example.vehicleservice.model.MaintenanceRecord;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "maintenance-service", url = "${maintenance.service.url}")
public interface MaintenanceServiceClient {

//    @GetMapping("/maintenance/vehicles/{vehicleId}/records")
//    List<MaintenanceRecord> getMaintenanceRecordsByVehicleId(@PathVariable("vehicleId") Long vehicleId);
//
//    @PostMapping("/maintenance/vehicles/{vehicleId}/records")
//    MaintenanceRecord createMaintenanceRecord(@PathVariable("vehicleId") Long vehicleId,
//                                              @RequestBody MaintenanceRecord maintenanceRecord);

}
