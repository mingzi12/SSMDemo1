package com.hmx.ssm.demo1.dao;

import com.hmx.ssm.demo1.model.User;
import com.hmx.ssm.demo1.util.CommonMapper;

/**
 * @author xxxx
 * @description: UserDao
 * @date 2019/5/14 9:56
 */
public interface UserDao extends CommonMapper<User> {

    /**
     * 根据id查找用户
     * @param id
     * @return 用户
     */
    User findUserById(int id);
}
