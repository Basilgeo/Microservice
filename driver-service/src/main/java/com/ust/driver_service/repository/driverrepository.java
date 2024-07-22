package com.ust.driver_service.repository;

import com.ust.driver_service.model.driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface driverrepository extends JpaRepository<driver,Long> {
}
