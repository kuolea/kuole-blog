package com.kuole.kuoleblog.dao;

import com.kuole.kuoleblog.entity.About;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 * @author jifang
 * @date 2020-09-09 16:00
 * description:
 */
@Mapper
@Repository
public interface AboutDao {
    //获取关于我的信息
    public About getAbout() throws Exception;

    //修改关于我的信息
    public void updateAbout(About about) throws Exception;

}
