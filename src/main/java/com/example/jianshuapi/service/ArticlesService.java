package com.example.jianshuapi.service;

import com.example.jianshuapi.entity.Articles;

import java.util.List;

public interface ArticlesService {
    List<Articles>getDescAll();

    List<Articles>getUserArticle(Integer id);
}
