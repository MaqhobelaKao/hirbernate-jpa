package com.maqhobela.hibernatedemo.controller;

import com.maqhobela.hibernatedemo.model.Location;
import com.maqhobela.hibernatedemo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class LocationController {

    @Autowired
    LocationService locationService;

    @GetMapping("/locations")
    public List<Location> getAllLocoations(){
        return locationService.getLocations();
    }

    @GetMapping("/location/{id}")
    public Optional<Location> getAllLocoationById(@PathVariable("id") Integer id){
        return locationService.getLocation(id);
    }

}
