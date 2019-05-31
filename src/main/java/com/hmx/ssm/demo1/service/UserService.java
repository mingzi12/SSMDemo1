package com.hmx.ssm.demo1.service;

import com.hmx.ssm.demo1.model.User;

/**
 * @author xxxx
 * @description: UserService
 * @date 2019/5/14 10:16
 */
public interface UserService {

    /**
     * 根据id查找用户
     * @param id
     * @return 用户
     */
    public User findUserById(int id);
}
