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
    @RequestMapping(value = "/ucomment/{id}")
    public ResponseUtil getArticleComment(@PathVariable Integer id){
        List<Articles>articlesList=articlesService.getOrderByComment(id);
        return new ResponseUtil(0,"get all userArticles order by comment!",articlesList);
    }
    @RequestMapping(value = "/ulike/{id}")
    public ResponseUtil getArticleLike(@PathVariable Integer id){
        List<Articles>articlesList=articlesService.getOrderByLike(id);
        return new ResponseUtil(0,"get all userArticles order by like!",articlesList);
    }

    @RequestMapping(value = "/p/{id}")
    public ResponseUtil getOneArticle(@PathVariable Integer id){
        Articles articles=articlesService.getOneArticle(id);
        return new ResponseUtil(0,"get all userArticles order by like!",articles);
    }
}
