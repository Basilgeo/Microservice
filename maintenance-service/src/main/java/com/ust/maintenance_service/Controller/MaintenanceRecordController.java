package com.ust.maintenance_service.Controller;

import com.ust.maintenance_service.Entity.MaintenanceRecord;
import com.ust.maintenance_service.Service.MaintenanceRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/maintenance")
public class MaintenanceRecordController {
    @Autowired
    private MaintenanceRecordService maintenanceRecordService;

    @GetMapping
    public List<MaintenanceRecord> getAllMaintenanceRecords() {
        return maintenanceRecordService.getAllMaintenanceRecords();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MaintenanceRecord> getMaintenanceRecordById(@PathVariable Long id) {
        MaintenanceRecord maintenanceRecord = maintenanceRecordService.getMaintenanceRecordById(id);
        return ResponseEntity.ok(maintenanceRecord);
    }

    @PostMapping
    public ResponseEntity<MaintenanceRecord> createMaintenanceRecord(@RequestBody MaintenanceRecord maintenanceRecord) {
        MaintenanceRecord createdMaintenanceRecord = maintenanceRecordService.createMaintenanceRecord(maintenanceRecord);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdMaintenanceRecord);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MaintenanceRecord> updateMaintenanceRecord(@PathVariable Long id, @RequestBody MaintenanceRecord maintenanceRecord) {
        MaintenanceRecord updatedMaintenanceRecord = maintenanceRecordService.updateMaintenanceRecord(id, maintenanceRecord);
        return ResponseEntity.ok(updatedMaintenanceRecord);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMaintenanceRecord(@PathVariable Long id) {
        maintenanceRecordService.deleteMaintenanceRecord(id);
        return ResponseEntity.noContent().build();
    }
}
