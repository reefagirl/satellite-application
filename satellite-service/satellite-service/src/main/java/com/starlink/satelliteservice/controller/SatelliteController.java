package com.starlink.satelliteservice.controller;

import com.starlink.satelliteservice.VO.ResponseTemplateVO;
import com.starlink.satelliteservice.entity.Satellite;
import com.starlink.satelliteservice.service.SatelliteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/satellites")
@Slf4j
public class SatelliteController {

    //The controller of the satelite rest API

    @Autowired
    private SatelliteService satelliteService;

    @PostMapping("/")
    public Satellite saveSatellite (@RequestBody Satellite satellite){
        log.info("Inside save satellite of satellite controller");
        return satelliteService.saveSatellite(satellite);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getSatelliteWithConstellation(@PathVariable("id") Long satelliteId){
        return satelliteService.getSatelliteWithConstellation(satelliteId);
    }

    @DeleteMapping("/{id}")
    public String deleteSatelliteWithConstellation(@PathVariable("id") Long satelliteId){
        return satelliteService.deleteSatelliteWithConstellation(satelliteId);
    }

}
