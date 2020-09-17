package com.kuole.kuoleblog.service;

import com.kuole.kuoleblog.entity.custom.SiteInfoCustom;
import org.springframework.stereotype.Service;

/**
 * @author jifang
 * @date 2020-09-08 15:03
 * description:
 */
public interface SiteInfoService {
   //获取所有站点信息
   public SiteInfoCustom getSiteInfoCustom() throws Exception;
}
