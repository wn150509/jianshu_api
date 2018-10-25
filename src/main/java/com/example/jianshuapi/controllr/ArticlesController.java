package com.example.jianshuapi.controllr;

import com.example.jianshuapi.entity.Articles;
import com.example.jianshuapi.entity.SysUser;
import com.example.jianshuapi.service.ArticlesService;
import com.example.jianshuapi.service.SysUserService;
import com.example.jianshuapi.utils.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/articles")
@CrossOrigin("http://localhost")
public class ArticlesController {
    @Resource
    private ArticlesService articlesService;
    @Resource
    private SysUserService sysUserService;
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ResponseUtil getDescAll(){
        return new ResponseUtil(0,"get index articles!",articlesService.getDescAll());
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseUtil getUserArticles(@PathVariable Integer id){
        List<Articles>articlesList=articlesService.getUserArticle(id);
        return new ResponseUtil(0,"get all userArticles!",articlesList);
    }

    @RequestMapping(value = "/articleTitle",method = RequestMethod.GET)
    public ResponseUtil getarticleTitle(){
        List<SysUser>sysUserList=sysUserService.getHotUsers();
        List<List>lists=new ArrayList<>();
        List<String >strings;
        for (int i=0;i<sysUserList.size();i++){
            strings=new ArrayList<>();
            for (int j=0;j<3;j++){
                strings.add(articlesService.getUserArticle(sysUserList.get(i).getUserId()).get(j).getArticleTitle());
            }
            lists.add(strings);
        }
        return new ResponseUtil(0,"get part userArticles!",lists);
    }
}
