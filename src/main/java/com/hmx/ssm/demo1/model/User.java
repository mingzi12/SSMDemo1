package com.hmx.ssm.demo1.model;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @author xxxx
 * @description: 如果数据库表和实体类的名称一致（忽略大小写），则@Table可以不配置。
 * @date 2019/5/14 9:48
 */
@Table(name = "user")
public class User {

    private int id;

    /**
     * 由于数据库中的字段是username,而实体类中的字段名称是userName，两者不对应，在通用mapper中拼接动态SQL是
     *     userName会变成user_name,这样会导致SQL执行失败。解决办法是添加@Column注解，使两者对应起来
     */
    @Column(name = "username")
    private String userName;

    public User() {

    }

    public User(String userName) {
        this.userName = userName;
    }

    public User(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "{id is " + this.id + ", userName is " + this.userName + "}";
    }
}
