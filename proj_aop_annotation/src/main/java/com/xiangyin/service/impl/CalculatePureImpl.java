package com.xiangyin.service.impl;

import com.xiangyin.service.Calculate;
import org.springframework.stereotype.Component;

@Component
public class CalculatePureImpl implements Calculate {
    @Override
    public int add(int i, int j) {

        int result = i + j;

        return result;
    }

    @Override
    public int sub(int i, int j) {

        int result = i - j;

        return result;
    }

    @Override
    public int mul(int i, int j) {

        int result = i * j;

        return result;
    }

    @Override
    public int div(int i, int j) {

        int result = i / j;

        return result;
    }
}
