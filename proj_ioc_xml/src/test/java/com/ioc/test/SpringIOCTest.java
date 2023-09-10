package com.ioc.test;

import com.ioc.Test01;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIOCTest {
    public void createIOC() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc01.xml");
    }

    @Test
    public void getBeanFromIOC() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        applicationContext.setConfigLocation("ioc01.xml");
        applicationContext.refresh();

        Test01 test01 = applicationContext.getBean("test01", Test01.class);
        Test01 test011 = applicationContext.getBean(Test01.class);
        test011.test01();
    }
}
