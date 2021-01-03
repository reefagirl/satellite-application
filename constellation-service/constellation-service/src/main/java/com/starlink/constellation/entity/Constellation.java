package com.starlink.constellation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Constellation {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long constellationId;
    private String constellationName;
    private String constellationCode;
}
