package com.ust.vehicle_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class vehicle {
    @Id
    private Long id;
    private String registrationNumber;
    private String brand;
    private String model;
    private String status;
}
