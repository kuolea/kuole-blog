package com.kuole.kuoleblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author jifang
 * @date 2020-09-10 15:58
 * description:
 */
@Controller
public class MusicShowController {
    @GetMapping("/music")
    public String about() {
        return "music";
    }
}
