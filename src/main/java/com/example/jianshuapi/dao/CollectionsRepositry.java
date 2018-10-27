package com.example.jianshuapi.dao;

import com.example.jianshuapi.entity.Collections;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CollectionsRepositry extends JpaRepository<Collections,Integer> {
    List<Collections>findAll();

    Collections findCollectionsByCollectionId(Integer id);
}
