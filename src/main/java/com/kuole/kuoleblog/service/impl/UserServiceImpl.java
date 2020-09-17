package com.kuole.kuoleblog.service.impl;

import com.kuole.kuoleblog.dao.UserDao;
import com.kuole.kuoleblog.entity.User;
import com.kuole.kuoleblog.service.UserService;
import com.kuole.kuoleblog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jifang
 * @date 2020-09-07 16:29
 * description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User checkUser(String username, String password) throws Exception {
        User user = userDao.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }

}
