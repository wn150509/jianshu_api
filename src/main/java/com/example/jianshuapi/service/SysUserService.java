package com.example.jianshuapi.service;

import com.example.jianshuapi.entity.LoginUser;
import com.example.jianshuapi.entity.SysUser;
import com.example.jianshuapi.utils.ResponseUtil;

import java.util.List;

public interface SysUserService {
    ResponseUtil userLogin(LoginUser loginUser);

    List<SysUser> getHotUsers();
}
