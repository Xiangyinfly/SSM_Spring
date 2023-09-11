package com.xiangyin.stu.controller;

import com.xiangyin.stu.pojo.Student;
import com.xiangyin.stu.service.StudentService;

import java.util.List;

public class StudentController {
    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void findAll() {
        List<Student> all = studentService.findAll();
        System.out.println(all);
    }
}
