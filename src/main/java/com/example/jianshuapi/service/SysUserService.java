package com.example.jianshuapi.service;

import com.example.jianshuapi.entity.Articles;
import com.example.jianshuapi.entity.LoginUser;
import com.example.jianshuapi.entity.SysUser;
import com.example.jianshuapi.utils.ResponseUtil;
import com.example.jianshuapi.vo.HotUserVO;

import java.util.List;

public interface SysUserService {
    ResponseUtil userLogin(LoginUser loginUser);

    List<SysUser> getHotUsers();

    SysUser findSomeOne(Integer id);

    List<HotUserVO> findAllHotUsers();
}
