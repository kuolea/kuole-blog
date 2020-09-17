package com.kuole.kuoleblog.controller;

import com.kuole.kuoleblog.entity.FriendLink;
import com.kuole.kuoleblog.service.FriendLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author jifang
 * @date 2020-09-10 10:39
 * description: 友链显示控制器
 */
@Controller
public class FriendShowController {
    @Autowired
    private FriendLinkService friendLinkService;

    @GetMapping("/friends")
    public String friends(Model model) throws Exception{
        List<FriendLink> friendLinks = friendLinkService.listFriendLink();
        model.addAttribute("friendLinks",friendLinks);
        return "friends";
    }
}
