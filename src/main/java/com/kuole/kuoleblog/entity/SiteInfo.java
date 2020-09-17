package com.kuole.kuoleblog.entity;

import java.util.Date;

/**
 * description:站点信息实体
 */
public class SiteInfo {
    private int id;
    private String name;
    private String indextitle;
    private String wechatpublic;
    private String wechat;
    private String qq;
    private String github;
    private String csdn;
    private String email;
    private Date createtime;
    private String author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndextitle() {
        return indextitle;
    }

    public void setIndextitle(String indextitle) {
        this.indextitle = indextitle;
    }

    public String getWechatpublic() {
        return wechatpublic;
    }

    public void setWechatpublic(String wechatpublic) {
        this.wechatpublic = wechatpublic;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getCsdn() {
        return csdn;
    }

    public void setCsdn(String csdn) {
        this.csdn = csdn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
