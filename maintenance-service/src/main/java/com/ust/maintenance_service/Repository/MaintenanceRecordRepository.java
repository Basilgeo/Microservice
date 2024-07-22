package com.ust.maintenance_service.Repository;

import com.ust.maintenance_service.Entity.MaintenanceRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MaintenanceRecordRepository extends JpaRepository<MaintenanceRecord,Long> {
}
