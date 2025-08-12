package com.example.demo.controller;

import com.example.demo.dto.GpsPoint;
import com.example.demo.service.GpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class GpsController {

    @Autowired
    private GpsService gpsService;

    @GetMapping("/gps-data")
    public List<GpsPoint> getGpsData() {
        return gpsService.getAllGpsPoints();
    }
}