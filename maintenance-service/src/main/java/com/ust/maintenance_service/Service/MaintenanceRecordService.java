package com.ust.maintenance_service.Service;

import com.ust.maintenance_service.Entity.MaintenanceRecord;
import com.ust.maintenance_service.Repository.MaintenanceRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaintenanceRecordService {
    @Autowired
    private MaintenanceRecordRepository maintenanceRecordRepository;

    public List<MaintenanceRecord> getAllMaintenanceRecords() {
        return maintenanceRecordRepository.findAll();
    }

    public MaintenanceRecord getMaintenanceRecordById(Long id) {
        return maintenanceRecordRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Maintenance Record not found with id: " + id));
    }

    public MaintenanceRecord createMaintenanceRecord(MaintenanceRecord maintenanceRecord) {
        return maintenanceRecordRepository.save(maintenanceRecord);
    }

    public MaintenanceRecord updateMaintenanceRecord(Long id, MaintenanceRecord maintenanceRecord) {
        maintenanceRecord.setId(id);
        return maintenanceRecordRepository.save(maintenanceRecord);
    }

    public void deleteMaintenanceRecord(Long id) {
        maintenanceRecordRepository.deleteById(id);
    }
}
