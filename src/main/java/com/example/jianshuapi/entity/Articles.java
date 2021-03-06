package com.example.jianshuapi.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@Builder
public class Articles {
    @Id
    @GeneratedValue
    private Integer articleId;
    private String articleTitle;
    private String articleContent;
    private String articleAuthor;
    private String articlePic;
    private Integer articleComment;
    private Integer articleLike;
    private Integer usersId;
    private Integer collectionsId;
    private Integer lookCount;
    private Date createTime;
    private Integer wordCount;
}
