package com.example.jianshuapi.dao;

import com.example.jianshuapi.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SysUserRepositry extends JpaRepository<SysUser, Integer> {
    /**
     * 根据邮箱查找用户
     * @param email
     * @return
     */
    SysUser findSysUserByEmail(String email);

    SysUser findSysUserByUserId(Integer id);

    /**
     * 根据热度降序排列
     * JPQL语句
     * @return
     */
    @Query("select u FROM SysUser  u ORDER BY u.likeCount DESC ")
    List<SysUser> findHotUsers();

    List<SysUser>findSysUserByCollectionsId(Integer id);
}
