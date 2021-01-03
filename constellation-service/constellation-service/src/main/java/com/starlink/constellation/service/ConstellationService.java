package com.starlink.constellation.service;

import com.starlink.constellation.entity.Constellation;
import com.starlink.constellation.repository.ConstellationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@Slf4j
public class ConstellationService {

    @Autowired
    private ConstellationRepository constellationRepository;

    public Constellation saveConstellation(@RequestBody Constellation constellation) {
        log.info("inside save constellation of constellation service");
        return constellationRepository.save(constellation);
    }

    public Constellation findConstelllationById(Long constellationId) {
        log.info("inside find constellation of constellation service");
        return constellationRepository.findByConstellationId(constellationId);
    }

    public List<Constellation> findAllConstellations() {
        return constellationRepository.findAll();
    }


}
