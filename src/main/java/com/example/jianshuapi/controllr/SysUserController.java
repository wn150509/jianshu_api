package com.example.jianshuapi.controllr;

import com.example.jianshuapi.entity.Articles;
import com.example.jianshuapi.entity.LoginUser;
import com.example.jianshuapi.entity.SysUser;
import com.example.jianshuapi.service.ArticlesService;
import com.example.jianshuapi.service.SysUserService;
import com.example.jianshuapi.utils.ResponseUtil;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:81")
public class SysUserController {
    @Resource
    private SysUserService sysUserService;
    @Resource
    private ArticlesService articlesService;

    @RequestMapping(value = "/sign_in", method = RequestMethod.POST)
    public ResponseUtil signIn(@RequestBody LoginUser loginUser) {
        System.out.println(loginUser);
        return sysUserService.userLogin(loginUser);
    }

    @RequestMapping(value = "/hot", method = RequestMethod.GET)
    public ResponseUtil getHotUsers() {
        return new ResponseUtil(0, "get hot users!", sysUserService.getHotUsers());
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseUtil getuserById(@PathVariable Integer id){
        SysUser user=sysUserService.findSomeOne(id);
        return new ResponseUtil(0,"get user!",user);
    }

    @RequestMapping(value = "/hotAll", method = RequestMethod.GET)
    public ResponseUtil getAllHotUsers() {
        return new ResponseUtil(0, "get hot users!", sysUserService.findAllHotUsers());
    }

    @RequestMapping(value = "/p/{id}")
    public ResponseUtil getArticleUser(@PathVariable Integer id){
        Articles articles=articlesService.getOneArticle(id);
        SysUser sysUser=sysUserService.findSomeOne(articles.getUsersId());
        return new ResponseUtil(0,"get all userArticles order by like!",sysUser);
    }
}
