package com.kuole.kuoleblog.config;

import com.kuole.kuoleblog.interceptor.LoginInterceptor;
import com.kuole.kuoleblog.interceptor.SiteOptionInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description: 指定拦截内容的配置类
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public SiteOptionInterceptor mysiteOptionInterceptor(){
        return new SiteOptionInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(mysiteOptionInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/admin/**")
                .excludePathPatterns("/admin")
                .excludePathPatterns("/admin/login");
    }




}