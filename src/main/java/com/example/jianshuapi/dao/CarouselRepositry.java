package com.example.jianshuapi.dao;

import com.example.jianshuapi.entity.Carousel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarouselRepositry extends JpaRepository<Carousel,Integer> {
    List<Carousel> findAll();
}
