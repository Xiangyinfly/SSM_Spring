package com.student;

import com.student.config.JavaConfig;
import com.student.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class tset1 {
    @Test
    public void test1() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        StudentController studentController = applicationContext.getBean(StudentController.class);
        studentController.findAll();
        applicationContext.close();
    }
}
