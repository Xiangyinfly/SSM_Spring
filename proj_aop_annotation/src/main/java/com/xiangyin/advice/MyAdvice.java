package com.xiangyin.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Before("com.xiangyin.pointcut.MyPointCut.myPc()")
    public void start(JoinPoint joinPoint) {
        //获取方法属于的类的名称
        String simpleName = joinPoint.getTarget().getClass().getSimpleName();
        //获取方法名
        String name = joinPoint.getSignature().getName();
        //获取形参
        Object[] args = joinPoint.getArgs();
        //获取访问修饰符
        int modifiers = joinPoint.getSignature().getModifiers();

    }
    @AfterReturning(value = "com.xiangyin.pointcut.MyPointCut.myPc()",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result) {

    }
    @After("com.xiangyin.pointcut.MyPointCut.myPc()")
    public void after(JoinPoint joinPoint){

    }
    @AfterThrowing(value = "com.xiangyin.pointcut.MyPointCut.myPc()",throwing = "throwable")
    public void afterThrowing(JoinPoint joinPoint,Throwable throwable){

    }

}
