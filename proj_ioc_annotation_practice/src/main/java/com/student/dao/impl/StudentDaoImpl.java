package com.student.dao.impl;

import com.student.dao.StudentDao;
import com.student.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Student> queryAll() {
        List<Student> students = jdbcTemplate.query("select * from students", new BeanPropertyRowMapper<>(Student.class));
        return students;
    }
}
