package com.xiangyin.stu.dao.impl;

import com.xiangyin.stu.dao.StudentDao;
import com.xiangyin.stu.pojo.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Student> queryAll() {
        List<Student> students = jdbcTemplate.query("select * from students", new BeanPropertyRowMapper<>(Student.class));
        return students;
    }
}
