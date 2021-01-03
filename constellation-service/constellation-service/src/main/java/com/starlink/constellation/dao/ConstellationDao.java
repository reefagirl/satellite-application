package com.starlink.constellation.dao;

import com.starlink.constellation.entity.Constellation;

public interface ConstellationDao {

    int insertConstellation(Long id, Constellation constellation);
}
