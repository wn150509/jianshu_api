package com.example.jianshuapi.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@Builder
public class Collections {
    @Id
    @GeneratedValue
    private Integer collectionId;

    private String collectionUrl;
    private String collectionName;
    private String collectionInfo;
    private Integer collectionArticle;
    private Integer collectionFans;
}
