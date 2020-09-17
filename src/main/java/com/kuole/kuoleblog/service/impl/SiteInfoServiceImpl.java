package com.kuole.kuoleblog.service.impl;

import com.kuole.kuoleblog.dao.SiteInfoDao;
import com.kuole.kuoleblog.entity.custom.SiteInfoCustom;
import com.kuole.kuoleblog.service.SiteInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jifang
 * @date 2020-09-08 15:05
 * description:
 */
@Service
public class SiteInfoServiceImpl implements SiteInfoService {
    @Autowired
    private SiteInfoDao siteInfoDao;
    @Override
    public SiteInfoCustom getSiteInfoCustom() throws Exception {
        SiteInfoCustom siteInfoCustom = siteInfoDao.getSiteInfo(1);
        return siteInfoCustom;
    }
}
