package com.example.jianshuapi.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * SysUser Entity Class
 *
 * @author Jwang
 * 2018.10.21
 * DO
 */
@Entity
@Data
@Builder
public class Carousel {
    @Id
    @GeneratedValue
    private Integer carouselId;

    private String carouselUrl;
}
