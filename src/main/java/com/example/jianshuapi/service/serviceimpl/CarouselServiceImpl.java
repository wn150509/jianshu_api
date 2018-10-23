package com.example.jianshuapi.service.serviceimpl;

import com.example.jianshuapi.dao.CarouselRepositry;
import com.example.jianshuapi.entity.Carousel;
import com.example.jianshuapi.service.CarouselService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CarouselServiceImpl implements CarouselService {
    @Resource
    private CarouselRepositry carouselRepositry;
    @Override
    public List<Carousel> findAllCal() {
        return carouselRepositry.findAll();
    }
}
