package com.hmx.ssm.demo1.model;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @author xxxx
 * @description: User
 * @date 2019/5/14 9:48
 */
@Table(name = "user")
public class User {

    private int id;

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
