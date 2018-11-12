package com.example.jianshuapi.service.serviceimpl;

import com.example.jianshuapi.dao.CommentsRepositry;
import com.example.jianshuapi.dao.SysUserRepositry;
import com.example.jianshuapi.entity.Comments;
import com.example.jianshuapi.entity.SysUser;
import com.example.jianshuapi.service.CommentsService;
import com.example.jianshuapi.vo.CommentVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class CommentsServiceImpl implements CommentsService {
    @Resource
    private CommentsRepositry commentsRepositry;
    @Resource
    private SysUserRepositry sysUserRepositry;
    @Override
    public List<CommentVo> getCommentsByArticleId(Integer id) {
        List<Comments>commentsList=commentsRepositry.findByArticleId(id);
        List<CommentVo>commentVoList=new ArrayList<>();
        for (Comments comments:commentsList){
            CommentVo commentVo=new CommentVo();
            commentVo.setComments(comments);
            commentVo.setSysUser(sysUserRepositry.findSysUserByUserId(comments.getUserId()));
            commentVoList.add(commentVo);
        }
        return commentVoList;
    }
}
