package com.example.demo.service;

import com.example.demo.dto.GpsPoint;
import com.example.demo.model.Arch;
import com.example.demo.repository.ArchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GpsService {

    @Autowired
    private ArchRepository archRepository;

    public List<GpsPoint> getAllGpsPoints() {
        List<Arch> archives = archRepository.findAll();
        return archives.stream()
            .map(archive -> {
                GpsPoint point = new GpsPoint();
                point.setLatitude(archive.getLatitude());
                point.setLongitude(archive.getLongitude());
                point.setInfo("Date: " + archive.getDate() + 
                              ", Speed: " + archive.getSpeed() + " km/h" +
                              ", RPM: " + archive.getRpm());
                return point;
            })
            .collect(Collectors.toList());
    }
}