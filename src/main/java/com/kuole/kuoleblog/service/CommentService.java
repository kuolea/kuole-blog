package com.kuole.kuoleblog.service;

import com.kuole.kuoleblog.entity.Comment;

import java.util.List;

/**
 * @Description: 博客评论业务层接口
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId) throws Exception;

    int saveComment(Comment comment) throws Exception;

//    查询子评论
//    List<Comment> getChildComment(Long blogId,Long id);

    //删除评论
    void deleteComment(Comment comment, Long id) throws Exception;

}