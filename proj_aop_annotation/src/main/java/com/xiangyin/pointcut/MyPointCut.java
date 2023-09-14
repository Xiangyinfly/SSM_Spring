package com.xiangyin.pointcut;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class MyPointCut {
    @Pointcut("execution(* com.xiangyin.service.impl.*.*(..))")
    public void pc(){}


    @Pointcut("execution(* com..impl.*.*(..))")
    public void myPc(){}
}
