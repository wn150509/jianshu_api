package com.example.jianshuapi.service.serviceimpl;

import com.example.jianshuapi.dao.ArticlesRepositry;
import com.example.jianshuapi.dao.CollectionsRepositry;
import com.example.jianshuapi.dao.SysUserRepositry;
import com.example.jianshuapi.entity.Articles;
import com.example.jianshuapi.entity.Collections;
import com.example.jianshuapi.entity.SysUser;
import com.example.jianshuapi.service.CollectionsService;
import com.example.jianshuapi.vo.CollectionVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Service
public class CollectionsServiceImpl implements CollectionsService {
    @Resource
    private CollectionsRepositry collectionsRepositry;
    @Resource
    private ArticlesRepositry articlesRepositry;
    @Resource
    private SysUserRepositry sysUserRepositry;
    @Override
    public List<Collections> findall() {
        return collectionsRepositry.findAll();
    }

    @Override
    public CollectionVo findCollection(Integer id) {
        Collections collection=collectionsRepositry.findCollectionsByCollectionId(id);
        List<Articles>articlesList=articlesRepositry.findArticlesByCollectionsId(collection.getCollectionId());
        List<SysUser>sysUserList=sysUserRepositry.findSysUserByCollectionsId(collection.getCollectionId());
        CollectionVo collectionVo=new CollectionVo();
        collectionVo.setCollections(collection);
        collectionVo.setArticlesList(articlesList);
        collectionVo.setSysUserList(sysUserList);
        return collectionVo;
    }
}
