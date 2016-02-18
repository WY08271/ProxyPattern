package com.pattern.proxy;

import java.util.Random;

public class CarTimeProxy implements Moveable{
    private Moveable moveable;

    public CarTimeProxy(Moveable moveable){
        super();
        this.moveable = moveable;
    }

    @Override
    public void move() {
        long starttime = System.currentTimeMillis();
        System.out.println("开始行驶..");

        moveable.move();

        long endtime = System.currentTimeMillis();
        System.out.println("结束行驶..行驶时间:"
                + (endtime - starttime) + "毫秒");
    }
}