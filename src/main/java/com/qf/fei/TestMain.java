package com.qf.fei;

import com.qf.fei.bean.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        String path = "classpath:spring-context.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
    }
}
