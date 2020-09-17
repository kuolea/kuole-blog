package com.kuole.kuoleblog.service.impl;

import com.kuole.kuoleblog.dao.BlogDao;
import com.kuole.kuoleblog.entity.Blog;
import com.kuole.kuoleblog.queryvo.*;
import com.kuole.kuoleblog.service.BlogService;
import com.kuole.kuoleblog.util.MarkdownUtils;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author jifang
 * @date 2020-09-07 11:27
 * description:
 */
@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogDao blogDao;

    @Override
    public ShowBlog getBlogById(Long id) throws Exception {
        return blogDao.getBlogById(id);
    }

    @Override
    public List<BlogQuery> getAllBlog() throws Exception {
        return blogDao.getAllBlogQuery();
    }

    @Override
    public int saveBlog(Blog blog) throws Exception {
        blog.setCreateTime(new Date());
        blog.setUpdateTime(new Date());
        blog.setViews(0);
        blog.setCommentCount(0);
        return blogDao.saveBlog(blog);
    }

    @Override
    public int updateBlog(ShowBlog showBlog) throws Exception {
        showBlog.setUpdateTime(new Date());
        return blogDao.updateBlog(showBlog);
    }

    @Override
    public void deleteBlog(Long id) throws Exception {
        blogDao.deleteBlog(id);
    }

    @Override
    public List<BlogQuery> getBlogBySearch(SearchBlog searchBlog) throws Exception{
        return blogDao.searchByTitleOrTypeOrRecommend(searchBlog);
    }

    @Override
    public List<FirstPageBlog> getAllFirstPageBlog() throws Exception {
        return blogDao.getFirstPageBlog();
    }

    @Override
    public List<RecommendBlog> getRecommendedBlog() throws Exception {
        List<RecommendBlog> allRecommendBlog = blogDao.getAllRecommendBlog();
        return allRecommendBlog;
    }

    @Override
    public List<FirstPageBlog> getSearchBlog(String query) throws Exception {
        return blogDao.getSearchBlog(query);
    }

    @Override
    public DetailedBlog getDetailedBlog(Long id) throws Exception {
        System.out.println(id);
        DetailedBlog detailedBlog = blogDao.getDetailedBlog(id);
        if (detailedBlog == null) {
            throw new NotFoundException("该博客不存在");
        }
        String content = detailedBlog.getContent();
        detailedBlog.setContent(MarkdownUtils.markdownToHtmlExtensions(content));
//        文章访问数量自增
        blogDao.updateViews(id);
//        文章评论数量更新
        blogDao.getCommentCountById(id);
        return detailedBlog;
    }

    @Override
    public List<FirstPageBlog> getByTypeId(Long typeId) throws Exception {
        return blogDao.getByTypeId(typeId);
    }

    @Override
    public Integer getBlogTotal() throws Exception {
        return blogDao.getBlogTotal();
    }

    @Override
    public Integer getBlogViewTotal() throws Exception {
        return blogDao.getBlogViewTotal();
    }

    @Override
    public Integer getBlogCommentTotal() throws Exception {
        return blogDao.getBlogCommentTotal();
    }

    @Override
    public Integer getBlogMessageTotal() throws Exception {
        return blogDao.getBlogMessageTotal();
    }
}
