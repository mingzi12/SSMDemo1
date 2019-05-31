package com.hmx.ssm.demo1.dao;

import com.hmx.ssm.demo1.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author unlike24
 * @title: UserDaoTest
 * @description: TODO
 * @date 2019/5/14 9:59
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void findUserByIdTest() {
        int userID = 1;

        User user = userDao.findUserById(userID);
        System.out.println(user);
    }

    //插入记录的测试(通过通用mapper接口实现)
    @Test
    public void test3() {
        User newUser = new User();
        newUser.setUserName("Peter");
        userDao.insert(newUser);
        System.out.println("插入成功");
    }

}
