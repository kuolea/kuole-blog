package com.kuole.kuoleblog.service;

import com.kuole.kuoleblog.entity.Type;

import java.util.List;


/**
 * @Description: 文章分类业务层接口
 */
public interface TypeService {

    int saveType(Type type) throws Exception;

    Type getType(Long id) throws Exception;

    List<Type>getAllType() throws Exception;

    List<Type>getAllTypeAndBlog() throws Exception;

    Type getTypeByName(String name) throws Exception;

    int updateType(Type type) throws Exception;

    void deleteType(Long id) throws Exception;




}