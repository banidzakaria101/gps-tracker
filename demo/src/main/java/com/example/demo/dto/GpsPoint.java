package com.example.demo.dto;

import lombok.Data;

@Data
public class GpsPoint {
    private double latitude;
    private double longitude;
    private String info;
}