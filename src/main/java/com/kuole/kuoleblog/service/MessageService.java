package com.kuole.kuoleblog.service;

import com.kuole.kuoleblog.entity.Message;

import java.util.List;

/**
 * @Description: 留言业务层接口
 */
public interface MessageService {

    //查询留言列表
    List<Message> listMessage() throws Exception;

    //保存留言
    int saveMessage(Message message) throws Exception;

    //删除留言
    void deleteMessage(Long id) throws Exception;

}