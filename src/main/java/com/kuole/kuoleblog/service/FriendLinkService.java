package com.kuole.kuoleblog.service;

import com.kuole.kuoleblog.entity.FriendLink;

import java.util.List;

/**
 * @Description: 友链业务层接口
 */
public interface FriendLinkService {

    //查询所有友链
    List<FriendLink> listFriendLink() throws Exception;

    //友链新增
    int saveFriendLink(FriendLink friendLink) throws Exception;

    //根据id查询友链
    FriendLink getFriendLink(Long id) throws Exception;

    //根据网址查询友链
    FriendLink getFriendLinkByBlogaddress(String blogaddress) throws Exception;

    //编辑修改友链
    int updateFriendLink(FriendLink friendLink) throws Exception;

    //删除友链
    void deleteFriendLink(Long id) throws Exception;


}