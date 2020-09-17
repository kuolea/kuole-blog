package com.kuole.kuoleblog.service;

import com.kuole.kuoleblog.entity.Blog;
import com.kuole.kuoleblog.queryvo.*;

import java.util.List;

/**
 * @Description: 博客列表业务层接口
 */
public interface BlogService {

    ShowBlog getBlogById(Long id) throws Exception;

    List<BlogQuery> getAllBlog() throws Exception;

    int saveBlog(Blog blog) throws Exception;

    int updateBlog(ShowBlog showBlog) throws Exception;

    void deleteBlog(Long id) throws Exception;

    List<BlogQuery> getBlogBySearch(SearchBlog searchBlog) throws Exception;

    List<FirstPageBlog> getAllFirstPageBlog() throws Exception;

    List<RecommendBlog> getRecommendedBlog() throws Exception;

//    List<FirstPageBlog> getNewBlog();

    List<FirstPageBlog> getSearchBlog(String query) throws Exception;

    DetailedBlog getDetailedBlog(Long id) throws Exception;

    //根据TypeId获取博客列表，在分类页进行的操作
    List<FirstPageBlog> getByTypeId(Long typeId) throws Exception;

    Integer getBlogTotal() throws Exception;

    Integer getBlogViewTotal() throws Exception;

    Integer getBlogCommentTotal() throws Exception;

    Integer getBlogMessageTotal() throws Exception;

}