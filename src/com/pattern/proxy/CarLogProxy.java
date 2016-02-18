package com.pattern.proxy;

public class CarLogProxy implements Moveable{
    private Moveable moveable;

    public CarLogProxy(Moveable moveable){
        super();
        this.moveable = moveable;
    }

    @Override
    public void move() {
        System.out.println("记录开始..");
        moveable.move();
        System.out.println("记录结束..");
    }
}
