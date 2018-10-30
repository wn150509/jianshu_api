package com.example.jianshuapi.service.serviceimpl;

import com.example.jianshuapi.dao.ArticlesRepositry;
import com.example.jianshuapi.entity.Articles;
import com.example.jianshuapi.service.ArticlesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticlesServiceImpl implements ArticlesService {
    @Resource
    private ArticlesRepositry articlesRepositry;
    @Override
    public List<Articles> getDescAll() {
        return articlesRepositry.findDescAll();
    }

    @Override
    public List<Articles> getUserArticle(Integer id) {
        return articlesRepositry.findArticlesByUsersId(id);
    }

    @Override
    public List<Articles> getOrderByComment(Integer id) {
        return articlesRepositry.findByUsersIdOrderByArticleCommentDesc(id);
    }

    @Override
    public List<Articles> getOrderByLike(Integer id) {
        return articlesRepositry.findByUsersIdOrderByArticleLikeDesc(id);
    }

    @Override
    public Articles getOneArticle(Integer id) {
        return articlesRepositry.findArticlesByArticleId(id);
    }
}
