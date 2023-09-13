package com.xiangyin.advice;

public class LogAdvice {
    public void start() {
        System.out.println("start");
    }
    public void after() {
        System.out.println("after");
    }
    public void error() {
        System.out.println("error");
    }
}
