package com.example.jianshuapi.controllr;

import com.example.jianshuapi.entity.Comments;
import com.example.jianshuapi.service.ArticlesService;
import com.example.jianshuapi.service.CommentsService;
import com.example.jianshuapi.service.SysUserService;
import com.example.jianshuapi.utils.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/comments")
@CrossOrigin("http://localhost:81")
public class CommentsController {
    @Resource
    private CommentsService commentsService;

    @RequestMapping(value = "/p/{id}",method = RequestMethod.GET)
    public ResponseUtil getCommentUser(@PathVariable Integer id){
        return new ResponseUtil(0,"get all oneArticleComments",commentsService.getCommentsByArticleId(id));
    }
}
