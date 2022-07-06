package com.tarpha.demo.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
public class Demo {

    @Id
    @GeneratedValue
    private Long id;

    private String keyText;

    private String valueText;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDt = new Date();
  
}
