package com.hmx.ssm.demo1.service.impl;

import com.hmx.ssm.demo1.dao.UserDao;
import com.hmx.ssm.demo1.model.User;
import com.hmx.ssm.demo1.service.UserService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xxxx
 * @description: UserServiceImpl
 * @date 2019/5/14 10:17
 */
@Service
public class UserServiceImpl implements UserService, InitializingBean {

    @Autowired
    private UserDao userDao;

    public UserServiceImpl() {
        System.out.println("UserServiceImpl 初始化。");
    }

    public User findUserById(int id) {

        return userDao.findUserById(id);
    }

    /**
     * UserServiceImpl初始化完成，并且userDao已经注入bean后，该方法才执行
     * @throws Exception
     */
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet 初始化。");

        if (userDao != null) {
            System.out.println("userDao 已经初始化。");

        }
    }
}
