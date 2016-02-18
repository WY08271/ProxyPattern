package com.pattern.proxy;

public class Test {
    public static void main(String[] args){
//        Car car = new Car();
//        car.move();

//        CarTimeProxy carTimeProxy = new CarTimeProxy();
//        carTimeProxy.move();

        Car car = new Car();
        Car3 car3 = new Car3(car);
        car3.move();
    }
}
