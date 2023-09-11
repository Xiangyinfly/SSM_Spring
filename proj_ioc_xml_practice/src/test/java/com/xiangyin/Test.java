package com.xiangyin;

import com.alibaba.druid.pool.DruidDataSource;
import com.xiangyin.stu.controller.StudentController;
import com.xiangyin.stu.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Test {
    public void test() {
//        DruidDataSource dataSource = new DruidDataSource();
//
//        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //jdbcTemplate.update("");
        //jdbcTemplate.queryForObject();
        //jdbcTemplate.query();
    }

    @org.junit.Test
    public void test1() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring01.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);

        String sql = "insert into students values (?,?,?,?,?)";
        int update = jdbcTemplate.update(sql, 9,"haha", "男", 18, "2022");
        System.out.println(update);

        String sql2 = "select * from students where id = ?";
//        Student student = jdbcTemplate.queryForObject(sql2, new RowMapper<Student>() {
//            @Override
//            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Student student = new Student();
//                student.setId(rs.getInt("id"));
//                student.setName(rs.getString("name"));
//                student.setGender(rs.getString("gender"));
//                student.setAge(rs.getInt("age"));
//                student.setClasses(rs.getString("classes"));
//                return student;
//            }
//        }, 1);


        Student stu = jdbcTemplate.queryForObject(sql2, (rs, rowNum) -> {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setGender(rs.getString("gender"));
                student.setAge(rs.getInt("age"));
                student.setClasses(rs.getString("classes"));
                return student;
            }, 1);
        System.out.println(stu);

        String sql3 = "select * from students";
        List<Student> query = jdbcTemplate.query(sql3, new BeanPropertyRowMapper<Student>(Student.class));
        System.out.println(query);
    }

    @org.junit.Test
    public void test2() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring02.xml");
        StudentController studentController = classPathXmlApplicationContext.getBean(StudentController.class);
        studentController.findAll();
        classPathXmlApplicationContext.close();
    }
}
