package com.xiangyin.advice;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LogAdvice {

    @Before("com.xiangyin.pointcut.MyPointCut.pc()")
    public void start() {
        System.out.println("start");
    }
    @After("com.xiangyin.pointcut.MyPointCut.pc()")
    public void after() {
        System.out.println("after");
    }
    @AfterThrowing("com.xiangyin.pointcut.MyPointCut.pc()")
    public void error() {
        System.out.println("error");
    }
}
