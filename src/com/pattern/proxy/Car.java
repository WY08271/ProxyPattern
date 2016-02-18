package com.pattern.proxy;

import java.util.Random;

public class Car implements Moveable{
    @Override
    public void move() {
//        long starttime = System.currentTimeMillis();
//        System.out.println("开始行驶..");

        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("行驶中..");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        long endtime = System.currentTimeMillis();
//        System.out.println("结束行驶..行驶时间:"
//                + (endtime - starttime) + "毫秒");
    }
}
