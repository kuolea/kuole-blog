package com.kuole.kuoleblog.controller;

import com.kuole.kuoleblog.queryvo.BlogQuery;
import com.kuole.kuoleblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author jifang
 * @date 2020-09-09 16:56
 * description: 时间轴页面显示控制器
 */
@Controller
public class ArchiveShowController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/archives")
    public String archive(Model model) throws Exception{
        List<BlogQuery> blogs = blogService.getAllBlog();
        model.addAttribute("blogs",blogs);
        return "archives";
    }

}
