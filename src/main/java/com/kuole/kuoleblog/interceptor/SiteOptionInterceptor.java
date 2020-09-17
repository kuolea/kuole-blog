package com.kuole.kuoleblog.interceptor;

import com.kuole.kuoleblog.entity.custom.SiteInfoCustom;
import com.kuole.kuoleblog.service.BlogService;
import com.kuole.kuoleblog.service.SiteInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author jifang
 * @date 2020-09-08 14:57
 * description: 站点信息的拦截器,每个请求都会拦截，注入站点信息
 */
@Component
public class SiteOptionInterceptor extends HandlerInterceptorAdapter {
    @Autowired
    SiteInfoService siteInfoService;

    @Autowired
    BlogService blogService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        SiteInfoCustom siteInfoCustom = new SiteInfoCustom();
        siteInfoCustom = siteInfoService.getSiteInfoCustom();
        siteInfoCustom.setBlogTotal(blogService.getBlogTotal());
        siteInfoCustom.setBlogViewTotal(blogService.getBlogViewTotal());
        siteInfoCustom.setBlogCommentTotal(blogService.getBlogCommentTotal());
        siteInfoCustom.setBlogMessageTotal(blogService.getBlogMessageTotal());
        request.setAttribute("siteInfo",siteInfoCustom);
        return true;
    }
}
