package com.example.jianshuapi.dao;

import com.example.jianshuapi.entity.Articles;
import com.example.jianshuapi.entity.Comments;
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
    SysUserRepositry sysUserRepositry;
    @Resource
    ArticlesRepositry articlesRepositry;
    @Resource
    CommentsRepositry commentsRepositry;
    @Test
    public void findHotUsers() throws Exception {
       SysUser sysUser=new SysUser();
       sysUser.setEmail("test1");
       sysUser.setPassword("test1");
       sysUserRepositry.save(sysUser);
    }

}