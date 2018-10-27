package com.example.jianshuapi.service;

import com.example.jianshuapi.entity.Collections;
import com.example.jianshuapi.vo.CollectionVo;

import java.util.List;

public interface CollectionsService {
    List<Collections>findall();

    CollectionVo findCollection(Integer id);
}
