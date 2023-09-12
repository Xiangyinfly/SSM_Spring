package com.student;

import com.student.controller.StudentController;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    @Test
    public void test1() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring01.xml");

        StudentController studentController = applicationContext.getBean(StudentController.class);
        studentController.findAll();
        applicationContext.close();
    }
}
