package com.starlink.satelliteservice.service;

import com.starlink.satelliteservice.VO.Constellation;
import com.starlink.satelliteservice.VO.ResponseTemplateVO;
import com.starlink.satelliteservice.entity.Satellite;
import com.starlink.satelliteservice.repository.SatelliteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class SatelliteService {

    @Autowired
    private SatelliteRepository satelliteRepository;

    @Autowired
    private RestTemplate restTemplate;


    public Satellite saveSatellite(Satellite satellite) {
        log.info("Inside save satellite of satellite service");
        return  satelliteRepository.save(satellite);
    }

    public ResponseTemplateVO getSatelliteWithConstellation(Long satelliteId) {
        log.info("Inside get satellite of satellite service");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Satellite satellite = satelliteRepository.findBySatelliteId(satelliteId);

        Constellation constellation = restTemplate.getForObject("http://CONSTELLATION-SERVICE/constellations/"
                + satellite.getConstellationId(),Constellation.class);

        vo.setSatellite(satellite);
        vo.setConstellation(constellation);

        return vo;
    }

    public String deleteSatelliteWithConstellation(Long satelliteId) {
        satelliteRepository.deleteById(satelliteId);
        return "Successfully decommisioned satelite";
    }
}
