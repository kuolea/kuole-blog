package com.kuole.kuoleblog.controller;

import net.minidev.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

/**
 * @author jifang
 * @date 2020-09-13 19:56
 * description:
 */
@Controller
public class FileController {
    //重配置文件,读取存放路径
    @ResponseBody
    @PostMapping("/upload")
    public JSONObject upLoad(@RequestParam(value = "editormd-image-file", required = false) MultipartFile file,
                             HttpServletRequest request) throws Exception{
        JSONObject object = new JSONObject();
        try {
            String nowRequest = request.getRequestURL().substring(0,request.getRequestURL().lastIndexOf("/"));
            //先获取在当前系统下的文件夹路径
            String realPath = getReslPath();
            //先创建文件夹
            File myFlie = new File(realPath);
            if (!myFlie.exists()) {
                myFlie.mkdirs();
            }
            //获取上传文件的文件名
            String fileName = file.getOriginalFilename();
            String uuid = UUID.randomUUID().toString().replace("-", "");
            fileName = uuid + "_" + fileName;
            file.transferTo(new File(realPath, fileName));
            object.put("success", 1);
            object.put("message", "上传成功");
            object.put("url",  nowRequest+"/upload/"+ fileName);
        } catch (Exception e) {

            object.put("success", 0);
            object.put("message", "上传失败");
        }

        return object;
    }

    @ResponseBody
    @PostMapping("/uploadpic")
    public JSONObject upLoad1(@RequestParam(value = "pic", required = false) MultipartFile file,
                             HttpServletRequest request) throws Exception{
        return upLoad(file,request);
    }


    public String getReslPath() {
        String osName = System.getProperty("os.name");
        String realPath;
        if (osName.toLowerCase().startsWith("win")) {
            realPath = "D:/upload/";
        } else {
            realPath = "/home/upload/";
        }
        return realPath;
    }

}
