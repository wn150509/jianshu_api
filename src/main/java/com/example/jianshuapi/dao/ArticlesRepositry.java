package com.example.jianshuapi.dao;

import com.example.jianshuapi.entity.Articles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArticlesRepositry extends JpaRepository<Articles,Integer> {
    @Query("select u from Articles u order by u.articleLike desc ")
    List<Articles> findDescAll();

    List<Articles> findArticlesByUsersId(Integer id);

    List<Articles>findArticlesByCollectionsId(Integer id);

//    @Query("select u from Articles u where u.usersId='#{id}'")
//    List<Articles>orderbyComment(Integer id);

    List<Articles>findByUsersIdOrderByArticleCommentDesc(Integer id);

    List<Articles>findByUsersIdOrderByArticleLikeDesc(Integer id);

    Articles findArticlesByArticleId(Integer id);
}
