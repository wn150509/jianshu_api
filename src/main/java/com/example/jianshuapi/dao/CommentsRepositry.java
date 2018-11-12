package com.example.jianshuapi.dao;

import com.example.jianshuapi.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentsRepositry extends JpaRepository<Comments,Integer> {
    List<Comments>findByArticleId(Integer id);
}
