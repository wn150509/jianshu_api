package com.example.jianshuapi.controllr;

import com.example.jianshuapi.service.CarouselService;
import com.example.jianshuapi.utils.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/carousel")
@CrossOrigin("http://localhost")
public class CarouselController {
    @Resource
    private CarouselService carouselService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseUtil getAllCarousel(){
        return new ResponseUtil(0,"get all carousel!",carouselService.findAllCal());
    }
}
