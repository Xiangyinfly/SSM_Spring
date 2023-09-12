package com.student;

import com.xiangyin.config.JavaConfig;
import com.xiangyin.student.StudentController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test1 {
    public void test1() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);

        StudentController studentController = applicationContext.getBean(StudentController.class);

    }
}
