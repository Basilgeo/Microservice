package com.ust.driver_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class driver {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String licenseNumber;
    private String contactNumber;
    private String email;
}
