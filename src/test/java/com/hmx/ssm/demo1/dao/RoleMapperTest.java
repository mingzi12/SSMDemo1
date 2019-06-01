package com.hmx.ssm.demo1.dao;

import com.hmx.ssm.demo1.model.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author TODO
 * @description: TODO
 * @date 2019/6/1 10:43
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class RoleMapperTest {

    @Autowired
    private RoleMapper roleMapper;

    @Test
    public void insertTest() {
        Role role = new Role("admin", "admin");
        roleMapper.insert(role);
    }

    @Test
    public void selectByPrimaryKeyTest() {
        Role role = roleMapper.selectByPrimaryKey("admin");
        System.out.println(role);
    }

}