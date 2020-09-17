package com.kuole.kuoleblog.service.impl;

import com.kuole.kuoleblog.dao.AboutDao;
import com.kuole.kuoleblog.entity.About;
import com.kuole.kuoleblog.service.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jifang
 * @date 2020-09-09 16:16
 * description: 关于我的服务实现
 */
@Service
public class AboutServiceImpl implements AboutService {
    @Autowired
    private AboutDao aboutDao;
    @Override
    public About getAbout() throws Exception {
        return aboutDao.getAbout();
    }

    @Override
    public void updateAbout(About about) throws Exception {
        aboutDao.updateAbout(about);
    }
}
