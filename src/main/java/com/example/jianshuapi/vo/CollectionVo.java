package com.example.jianshuapi.vo;

import com.example.jianshuapi.entity.Articles;
import com.example.jianshuapi.entity.Collections;
import com.example.jianshuapi.entity.SysUser;
import lombok.Data;

import java.io.Serializable;
import java.util.List;


@Data
public class CollectionVo implements Serializable{
    private Collections collections;
    private List<Articles>articlesList;
    private List<SysUser>sysUserList;

    public CollectionVo() {
    }

    public CollectionVo(Collections collections, List<Articles> articlesList, List<SysUser> sysUserList) {
        this.collections = collections;
        this.articlesList = articlesList;
        this.sysUserList = sysUserList;
    }
}
