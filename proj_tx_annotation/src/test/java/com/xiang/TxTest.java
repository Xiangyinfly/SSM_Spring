package com.xiang;

import com.xiang.config.JavaConfig;
import com.xiang.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(JavaConfig.class)
public class TxTest {
    @Autowired
    private StudentService studentService;

    @Test
    public void test1() {
        studentService.changeInfo();
    }
}
