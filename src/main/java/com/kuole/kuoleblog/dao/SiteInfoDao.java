package com.kuole.kuoleblog.dao;

import com.kuole.kuoleblog.entity.SiteInfo;
import com.kuole.kuoleblog.entity.custom.SiteInfoCustom;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author jifang
 * @date 2020-09-08 10:18
 * description:
 */
@Mapper
@Repository
public interface SiteInfoDao {
    //获取站点信息
    SiteInfoCustom getSiteInfo(@Param(value = "n") int n) throws Exception;

    //更新站点信息
    void updateSiteInfo(SiteInfo siteInfo) throws Exception;
}
