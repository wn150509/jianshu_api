package com.example.jianshuapi.vo;

import com.example.jianshuapi.entity.Comments;
import com.example.jianshuapi.entity.SysUser;
import lombok.Data;

@Data
public class CommentVo {
    private Comments comments;
    private SysUser sysUser;

    public CommentVo() {
    }

    public CommentVo(Comments comments, SysUser sysUser) {
        this.comments = comments;
        this.sysUser = sysUser;
    }
}
