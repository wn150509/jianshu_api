package com.example.jianshuapi.vo;

import com.example.jianshuapi.entity.Articles;
import com.example.jianshuapi.entity.SysUser;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class HotUserVO implements Serializable {
    private SysUser sysUser;
    private List<Articles> articlesList;

    public HotUserVO() {

    }

    public HotUserVO(SysUser sysUser, List<Articles> articlesList) {
        this.sysUser = sysUser;
        this.articlesList = articlesList;
    }
}
