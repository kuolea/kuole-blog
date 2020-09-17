package com.kuole.kuoleblog.entity;

/**
 * @author jifang
 * @date 2020-09-09 15:57
 * description: 关于我的内容
 */
public class About {
    private int id;

    //关于我的内容
    private String aboutme;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAboutme() {
        return aboutme;
    }

    public void setAboutme(String aboutme) {
        this.aboutme = aboutme;
    }
}
