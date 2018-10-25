package com.example.jianshuapi.dao;

import com.example.jianshuapi.entity.SysUser;
import com.example.jianshuapi.service.ArticlesService;
import com.example.jianshuapi.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserRepositryTest {
    @Resource
    SysUserService sysUserService;
    @Resource
    ArticlesService articlesService;
    @Test
    public void findHotUsers() throws Exception {
        List<SysUser>sysUserList=sysUserService.getHotUsers();
        List<Map>mapList=new ArrayList<>();
        Map<Integer,String > map;
        for (int i=0;i<sysUserList.size();i++){
            map=new HashMap<>();
            for (int j=0;j<3;j++){
                map.put(sysUserService.getHotUsers().get(i).getUserId(),articlesService.getUserArticle(sysUserList.get(i).getUserId()).get(j).getArticleTitle());
            }
            mapList.add(map);
        }
        mapList.forEach(map1 -> System.out.println(map1));
    }

}