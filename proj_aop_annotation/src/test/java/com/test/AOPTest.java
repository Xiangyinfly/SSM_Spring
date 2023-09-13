package com.test;

import com.xiangyin.config.JavaConfig;
import com.xiangyin.service.Calculate;
import com.xiangyin.service.impl.CalculatePureImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(value = JavaConfig.class)
public class AOPTest {

    @Autowired
    private Calculate calculate;

    @Test
    public void test1() {
        int add = calculate.add(1,2);
        System.out.println(add);
    }
}
