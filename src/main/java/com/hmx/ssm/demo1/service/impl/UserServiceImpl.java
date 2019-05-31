package com.hmx.ssm.demo1.service.impl;

import com.hmx.ssm.demo1.dao.UserDao;
import com.hmx.ssm.demo1.model.User;
import com.hmx.ssm.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xxxx
 * @description: UserServiceImpl
 * @date 2019/5/14 10:17
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User findUserById(int id) {

        return userDao.findUserById(id);
    }
}
