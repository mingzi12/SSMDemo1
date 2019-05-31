package com.hmx.ssm.demo1.controller;

import com.hmx.ssm.demo1.model.User;
import com.hmx.ssm.demo1.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author xxxx
 * @description: UserController
 * @date 2019/5/14 10:20
 */

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/getUser")
    public String getUserById(Model model) {
        int id = 1;
        User user = this.userService.findUserById(id);
        model.addAttribute("user", user);
        return "index";
    }
}
