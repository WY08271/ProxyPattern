package com.pattern.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args){
        Car car = new Car();
        InvocationHandler h = new TimeHandle(car);

        Movables m = (Movables)Proxy.newProxyInstance(car.getClass().getClassLoader(),
                car.getClass().getInterfaces(), h);
        m.move();
    }
}
