package com.kuole.kuoleblog.entity.custom;

import com.kuole.kuoleblog.entity.SiteInfo;

/**
 * @author jifang
 * @date 2020-09-06 18:14
 * description: 站点信息的增强
 */
public class SiteInfoCustom extends SiteInfo {
    private int blogTotal;
    private int blogViewTotal;
    private int blogCommentTotal;
    private int blogMessageTotal;

    public int getBlogTotal() {
        return blogTotal;
    }

    public void setBlogTotal(int blogTotal) {
        this.blogTotal = blogTotal;
    }

    public int getBlogViewTotal() {
        return blogViewTotal;
    }

    public void setBlogViewTotal(int blogViewTotal) {
        this.blogViewTotal = blogViewTotal;
    }

    public int getBlogCommentTotal() {
        return blogCommentTotal;
    }

    public void setBlogCommentTotal(int blogCommentTotal) {
        this.blogCommentTotal = blogCommentTotal;
    }

    public int getBlogMessageTotal() {
        return blogMessageTotal;
    }

    public void setBlogMessageTotal(int blogMessageTotal) {
        this.blogMessageTotal = blogMessageTotal;
    }
}
