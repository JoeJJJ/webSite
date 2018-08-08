package com.qiqi.mvcDemo.service.impl;

import com.qiqi.mvcDemo.dao.UserDao;
import com.qiqi.mvcDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 服务层
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void add() {
        if (true) {
            System.out.println("Service打印add方法！");
        }
        userDao.add();
    }
}
