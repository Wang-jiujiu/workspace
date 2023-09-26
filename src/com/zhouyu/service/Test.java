package com.zhouyu.service;

import com.zhouyu.spring.ZhouyuApplicationContext;

public class Test {
    public static void main(String[] args) {

   /*     ZhouyuApplicationContext zhouyuApplicationContext = new ZhouyuApplicationContext(AppConfig.class);
        UserService userServicce = (UserService) zhouyuApplicationContext.getBean("userServicce");
        userServicce.test();*/
        Teacher teacher = new Teacher();
        teacher.say();
        OneTeacher teacher1 = new OneTeacher();
        teacher1.say();
    }
}
