package com.example.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table
@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String departmentName;

    @JoinColumn(name = "location_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Location location;
}
