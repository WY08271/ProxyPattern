package com.pattern.proxy;

public class Test {
    public static void main(String[] args){
//        Car car = new Car();
//        car.move();

//        Car2 car2 = new Car2();
//        car2.move();

        Car car = new Car();
        Car3 car3 = new Car3(car);
        car3.move();
    }
}
