package com.kuole.kuoleblog.service;

import com.kuole.kuoleblog.entity.Picture;

import java.util.List;

/**
 * @Description: 照片墙业务层接口
 */
public interface PictureService {

    //查询照片
    List<Picture> listPicture() throws Exception;

    //添加图片
    int savePicture(Picture picture) throws Exception;

    //根据id查询照片
    Picture getPicture(Long id) throws Exception;

//    编辑修改相册
    int updatePicture(Picture picture) throws Exception;

//    删除照片
    void deletePicture(Long id) throws Exception;

}