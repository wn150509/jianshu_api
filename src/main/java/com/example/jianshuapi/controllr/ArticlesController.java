package com.example.jianshuapi.controllr;

import com.example.jianshuapi.entity.Articles;
import com.example.jianshuapi.service.ArticlesService;
import com.example.jianshuapi.utils.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/articles")
@CrossOrigin("http://localhost:81")
public class ArticlesController {
    @Resource
    private ArticlesService articlesService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ResponseUtil getDescAll(){
        return new ResponseUtil(0,"get index articles!",articlesService.getDescAll());
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseUtil getUserArticles(@PathVariable Integer id){
        List<Articles>articlesList=articlesService.getUserArticle(id);
        return new ResponseUtil(0,"get all userArticles!",articlesList);
    }
}
