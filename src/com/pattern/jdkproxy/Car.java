package com.pattern.jdkproxy;

import com.pattern.proxy.Moveable;

import java.util.Random;

public class Car implements Moveable {
    @Override
    public void move() {

        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("行驶中..");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
