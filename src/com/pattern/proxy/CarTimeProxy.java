package com.pattern.proxy;

import java.util.Random;

public class CarTimeProxy extends Car{
    @Override
    public void move() {
        long starttime = System.currentTimeMillis();
        System.out.println("开始行驶..");

        super.move();

        long endtime = System.currentTimeMillis();
        System.out.println("结束行驶..行驶时间:"
                + (endtime - starttime) + "毫秒");
    }
}
