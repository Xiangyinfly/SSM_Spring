package com.xiangyin.stu.service.impl;

import com.xiangyin.stu.dao.StudentDao;
import com.xiangyin.stu.pojo.Student;
import com.xiangyin.stu.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> findAll() {
        return studentDao.queryAll();
    }
}
