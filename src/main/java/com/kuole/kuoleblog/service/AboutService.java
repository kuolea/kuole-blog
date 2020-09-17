package com.kuole.kuoleblog.service;

import com.kuole.kuoleblog.entity.About;

/**
 * @author jifang
 * @date 2020-09-09 16:13
 * description: 关于我的服务
 */
public interface AboutService {
    //获取关于我的信息
    public About getAbout() throws Exception;

    //修改关于我的信息
    public void updateAbout(About about) throws Exception;
}
