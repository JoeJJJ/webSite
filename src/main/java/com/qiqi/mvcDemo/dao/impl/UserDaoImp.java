package com.qiqi.mvcDemo.dao.impl;

import com.qiqi.mvcDemo.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * 持久层
 */
@Repository
public class UserDaoImp implements UserDao {

    public void add() {
        if (true) {
            System.out.println("Dao打印add方法！");
        }
    }
}
