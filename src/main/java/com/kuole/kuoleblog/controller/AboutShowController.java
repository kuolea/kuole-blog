package com.kuole.kuoleblog.controller;

import com.kuole.kuoleblog.entity.About;
import com.kuole.kuoleblog.service.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author jifang
 * @date 2020-09-07 17:31
 * description:
 */
@Controller
public class AboutShowController {
    @Autowired
    private AboutService aboutService;

    @GetMapping("/about")
    public String about(Model model) throws Exception{
        About about = aboutService.getAbout();
        model.addAttribute("about",about);
        return "about";
    }
}
