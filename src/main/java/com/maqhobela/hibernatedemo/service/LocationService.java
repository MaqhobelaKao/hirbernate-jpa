package com.maqhobela.hibernatedemo.service;

import com.maqhobela.hibernatedemo.model.Location;
import com.maqhobela.hibernatedemo.repository.LocationRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {
    @Resource
    LocationRepository locationRepository;

    public List<Location> getLocations(){
        return (List<Location>) locationRepository.findAll();
    }

    public Optional<Location> getLocation(Integer id){
        return locationRepository.findById(id);
    }
}
