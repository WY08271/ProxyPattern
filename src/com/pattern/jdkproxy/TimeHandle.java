package com.pattern.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandle implements InvocationHandler {
    private Object target;

    public TimeHandle(Object target){
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        long starttime = System.currentTimeMillis();
        System.out.println("开始行驶..");

        method.invoke(target);

        long endtime = System.currentTimeMillis();
        System.out.println("结束行驶..行驶时间:"
                + (endtime - starttime) + "毫秒");

        return null;
    }
}
