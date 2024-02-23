package com.example.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String city;
    private String country;
    private String street;
    private String postCode;
}
