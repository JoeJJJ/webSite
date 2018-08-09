package com.qiqi.mvcDemoTest;

import com.qiqi.mvcDemo.web.UserController;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*运行使用Junit测试类*/
@RunWith(SpringJUnit4ClassRunner.class)
/*spring 配置文件设置*/
@ContextConfiguration("classpath:applicationContext.xml")
public class Test {

    @Autowired
    private UserController userController;

    @org.junit.Test
    public void test(){
        System.out.println("测试类打印！");
        userController.add();

        for (int i = 9 ; i > 0; i--) {
            System.out.println("i = " + i);
        }

    }


}
