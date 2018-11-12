package com.example.jianshuapi.service;

import com.example.jianshuapi.entity.Comments;
import com.example.jianshuapi.vo.CommentVo;

import java.util.List;

public interface CommentsService {
    List<CommentVo>getCommentsByArticleId(Integer id);
}
