package com.starlink.satelliteservice.repository;

import com.starlink.satelliteservice.entity.Satellite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SatelliteRepository extends JpaRepository<Satellite, Long> {

    Satellite findBySatelliteId(Long satelliteId);
}
