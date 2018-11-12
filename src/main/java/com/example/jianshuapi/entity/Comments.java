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
public class Comments {
    @Id
    @GeneratedValue
    private Integer commentId;

    private Date commentTime;

    private String commentContent;

    private Integer articleId;

    private Integer userId;
}
