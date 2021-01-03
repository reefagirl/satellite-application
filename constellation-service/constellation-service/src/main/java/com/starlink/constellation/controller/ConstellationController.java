package com.starlink.constellation.controller;


import com.starlink.constellation.entity.Constellation;
import com.starlink.constellation.service.ConstellationService;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/constellations")
@Slf4j
public class ConstellationController {

    @Autowired
    private ConstellationService constellationService;

    @RequestMapping("/")
    public Constellation saveConstellation(@RequestBody Constellation constellation){
        log.info("Inside the save constellation method of constellation controller");
        return constellationService.saveConstellation(constellation);
    }


    @GetMapping("/{id}")
    public Constellation findByConstellationId(@PathVariable("id") Long constellationId){
        log.info("inside find constellation of constellation service");
        return constellationService.findConstelllationById(constellationId);
    }

    @GetMapping("/allconstellations")
    public List<Constellation> getAllConstellations(){
        return constellationService.findAllConstellations();
    }
}
