package com.example.jianshuapi.service;

import com.example.jianshuapi.entity.Articles;
import com.example.jianshuapi.entity.SysUser;

import java.util.List;

public interface ArticlesService {
    List<Articles>getDescAll();

    List<Articles>getUserArticle(Integer id);

    List<Articles>getOrderByComment(Integer id);
    List<Articles>getOrderByLike(Integer id);

    Articles getOneArticle(Integer id);
}
