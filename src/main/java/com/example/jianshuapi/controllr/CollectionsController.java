package com.example.jianshuapi.controllr;

import com.example.jianshuapi.entity.Collections;
import com.example.jianshuapi.service.CollectionsService;
import com.example.jianshuapi.utils.ResponseUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/collections")
@CrossOrigin("http://localhost")
public class CollectionsController {
    @Resource
    private CollectionsService collectionsService;
    @RequestMapping(value = "/part",method = RequestMethod.GET)
    public ResponseUtil getPart(){
        List<Collections>collectionsList=collectionsService.findall();
        List<Collections>collections=new ArrayList<>();
        for (int i=0;i<7;i++){
            collections.add(collectionsList.get(i));
        }
        return new ResponseUtil(0,"get part collections!",collections);
    }
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public ResponseUtil getAll(){
        return new ResponseUtil(0,"get all collections!",collectionsService.findall());
    }
}
