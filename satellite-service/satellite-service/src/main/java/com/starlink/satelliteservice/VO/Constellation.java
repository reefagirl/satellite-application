package com.starlink.satelliteservice.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Constellation {
    private Long constellationId;
    private String constellationName;
    private String constellationCode;
}
