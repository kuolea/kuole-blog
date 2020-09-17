package com.kuole.kuoleblog.service.impl;

import com.kuole.kuoleblog.dao.TypeDao;
import com.kuole.kuoleblog.entity.Type;
import com.kuole.kuoleblog.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jifang
 * @date 2020-09-07 16:27
 * description:
 */
@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeDao typeDao;

    @Override
    public int saveType(Type type) throws Exception {
        return typeDao.saveType(type);
    }

    @Override
    public Type getType(Long id) throws Exception {
        return typeDao.getType(id);
    }

    @Override
    public List<Type> getAllType() throws Exception {
        return typeDao.getAllType();
    }

    @Override
    public List<Type> getAllTypeAndBlog() throws Exception {
        return typeDao.getAllTypeAndBlog();
    }

    @Override
    public Type getTypeByName(String name) throws Exception {
        return typeDao.getTypeByName(name);
    }

    @Override
    public int updateType(Type type) throws Exception {
        return typeDao.updateType(type);
    }

    @Override
    public void deleteType(Long id) throws Exception {
        typeDao.deleteType(id);
    }
}
