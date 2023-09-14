package com.xiangyin.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TxAroundAdvice {

    @Around("com.xiangyin.pointcut.MyPointCut.pc()")
    public Object transaction(ProceedingJoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        Object result = null;
        try {
            result = joinPoint.proceed(args);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}
