package com.kuole.kuoleblog.dao;

import com.kuole.kuoleblog.entity.Blog;
import com.kuole.kuoleblog.queryvo.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author jifang
 * @date 2020-09-06 19:35
 * description:
 */
@Mapper
@Repository
public interface BlogDao {
    //修改文章时，用来回调的
    ShowBlog getBlogById(Long id) throws Exception;

    //获取所有文章
    List<Blog> getAllBlog() throws Exception;

    //查询文章管理列表
    List<BlogQuery> getAllBlogQuery() throws Exception;

    //保存文章
    int saveBlog(Blog blog) throws Exception;

    //对文章进行更新
    int updateBlog(ShowBlog showBlog) throws Exception;

    //删除文章
    void deleteBlog(Long id) throws Exception;

    //获取查询的文章
    List<BlogQuery> searchByTitleOrTypeOrRecommend(SearchBlog searchBlog) throws Exception;

    //获取首页文章
    List<FirstPageBlog> getFirstPageBlog() throws Exception;

    //获取推荐文章
    List<RecommendBlog> getAllRecommendBlog() throws Exception;

    //搜索文章
    List<FirstPageBlog> getSearchBlog(String query) throws Exception;

    //文章详情
    DetailedBlog getDetailedBlog(Long id) throws Exception;

    //更新阅读量
    int updateViews(Long id) throws Exception;

    //根据博客id查询出评论数量
    int getCommentCountById(Long id) throws Exception;

    //更具文章标签类型获取文章
    List<FirstPageBlog> getByTypeId(Long typeId) throws Exception;

    //获取所有文章数
    Integer getBlogTotal() throws Exception;

    //获取浏览总数
    Integer getBlogViewTotal() throws Exception;

    //获取评论总数
    Integer getBlogCommentTotal() throws Exception;

    //获取留言总数
    Integer getBlogMessageTotal() throws Exception;
}
