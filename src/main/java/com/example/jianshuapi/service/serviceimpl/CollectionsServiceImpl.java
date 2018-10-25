package com.example.jianshuapi.service.serviceimpl;

import com.example.jianshuapi.dao.CollectionsRepositry;
import com.example.jianshuapi.entity.Collections;
import com.example.jianshuapi.service.CollectionsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CollectionsServiceImpl implements CollectionsService {
    @Resource
    private CollectionsRepositry collectionsRepositry;
    @Override
    public List<Collections> findall() {
        return collectionsRepositry.findAll();
    }
}
