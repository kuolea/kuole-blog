package com.kuole.kuoleblog.controller.admin;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kuole.kuoleblog.entity.Picture;
import com.kuole.kuoleblog.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

/**
 * @author jifang
 * @date 2020-09-10 16:39
 * description:
 */
@Controller
@RequestMapping("/admin")
public class PictureController {
    @Autowired
    private PictureService pictureService;

    //    查询照片列表
    @GetMapping("/pictures")
    public String pictures(Model model,@RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum) throws Exception{
        PageHelper.startPage(pageNum,10);
        List<Picture> listFriendLink = pictureService.listPicture();
        PageInfo<Picture> pageInfo = new PageInfo<Picture>(listFriendLink);
        model.addAttribute("pageInfo",pageInfo);
        return "admin/pictures";
    }

    //    跳转新增页面
    @GetMapping("/pictures/input")
    public String input(Model model) throws Exception{
        model.addAttribute("picture", new Picture());
        return "admin/pictures-input";
    }

    //    照片新增
    @PostMapping("/pictures")
    public String post(@Validated Picture picture, BindingResult result, RedirectAttributes attributes) throws Exception{

        if(result.hasErrors()){
            return "admin/pictures-input";
        }

        int P = pictureService.savePicture(picture);
        if (P == 0 ) {
            attributes.addFlashAttribute("message", "新增失败");
        } else {
            attributes.addFlashAttribute("message", "新增成功");
        }
        return "redirect:/admin/pictures";
    }

    //    跳转照片编辑页面
    @GetMapping("/pictures/{id}/input")
    public String editInput(@PathVariable Long id, Model model) throws Exception{
        model.addAttribute("picture", pictureService.getPicture(id));
        return "admin/pictures-input";
    }

    //    编辑相册
    @PostMapping("/pictures/{id}")
    public String editPost(@Validated Picture picture, RedirectAttributes attributes) throws Exception{

        int P = pictureService.updatePicture(picture);
        if (P == 0 ) {
            attributes.addFlashAttribute("message", "编辑失败");
        } else {
            attributes.addFlashAttribute("message", "编辑成功");
        }
        return "redirect:/admin/pictures";
    }

    //    删除照片
    @GetMapping("/pictures/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes attributes) throws Exception{
        pictureService.deletePicture(id);
        attributes.addFlashAttribute("message", "删除成功");
        return "redirect:/admin/pictures";
    }
}
