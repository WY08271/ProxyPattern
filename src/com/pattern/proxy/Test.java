package com.pattern.proxy;

public class Test {
    public static void main(String[] args){
        Car car = new Car();
        car.move();

        Car2 car2 = new Car2();
        car2.move();
    }
}
