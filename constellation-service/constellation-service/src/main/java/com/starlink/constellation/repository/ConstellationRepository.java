package com.starlink.constellation.repository;

import com.starlink.constellation.entity.Constellation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstellationRepository extends JpaRepository<Constellation, Long> {
    Constellation findByConstellationId(Long constellationId);
}
