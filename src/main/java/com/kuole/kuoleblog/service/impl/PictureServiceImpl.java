package com.kuole.kuoleblog.service.impl;

import com.kuole.kuoleblog.dao.PictureDao;
import com.kuole.kuoleblog.entity.Picture;
import com.kuole.kuoleblog.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jifang
 * @date 2020-09-07 16:25
 * description:
 */
@Service
public class PictureServiceImpl implements PictureService {

    @Autowired
    private PictureDao pictureDao;

    @Override
    public List<Picture> listPicture() throws Exception {
        return pictureDao.listPicture();
    }

    @Override
    public int savePicture(Picture picture) throws Exception {
        return pictureDao.savePicture(picture);
    }

    @Override
    public Picture getPicture(Long id) throws Exception {
        return pictureDao.getPicture(id);
    }

    @Override
    public int updatePicture(Picture picture) throws Exception {
        return pictureDao.updatePicture(picture);
    }

    @Override
    public void deletePicture(Long id) throws Exception {
        pictureDao.deletePicture(id);
    }
}
