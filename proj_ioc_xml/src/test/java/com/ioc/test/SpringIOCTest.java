package com.ioc.test;

import com.ioc.Test01;
import com.ioc.factoryBean.JavaBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIOCTest {
    public void createIOC() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring01.xml");
    }

    @Test
    public void getBeanFromIOC() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        applicationContext.setConfigLocation("spring01.xml");
        applicationContext.refresh();

        Test01 test01 = applicationContext.getBean("test01", Test01.class);
        Test01 test011 = applicationContext.getBean(Test01.class);
        test011.test01();
    }

    @Test
    public void test01() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring03.xml");
        JavaBean javaBean = classPathXmlApplicationContext.getBean("javaBean", JavaBean.class);
        System.out.println(javaBean);
        classPathXmlApplicationContext.close();
    }
}
