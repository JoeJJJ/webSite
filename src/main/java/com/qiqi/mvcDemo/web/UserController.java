package com.qiqi.mvcDemo.web;

import com.qiqi.mvcDemo.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 控制层
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void add() {
        if (true) {
            System.out.println("Controller打印add方法！");
        }
        userService.add();
    }
}
