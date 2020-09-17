package com.kuole.kuoleblog.controller;

import com.kuole.kuoleblog.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author jifang
 * @date 2020-09-10 15:58
 * description:
 */
@Controller
public class PictureShowController {
    @Autowired
    private PictureService pictureService;

    @GetMapping("/picture")
    public String friends(Model model) throws Exception{
        model.addAttribute("pictures",pictureService.listPicture());
        return "picture";
    }
}
