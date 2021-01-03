package com.starlink.satelliteservice.VO;

import com.starlink.satelliteservice.entity.Satellite;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private Satellite satellite;
    private Constellation constellation;
}
