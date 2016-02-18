package com.pattern.proxy;

public class Test {
    public static void main(String[] args){
//        Car car = new Car();
//        car.move();

//        CarTimeProxy carTimeProxy = new CarTimeProxy();
//        carTimeProxy.move();

//        Car car = new Car();
//        Car3 car3 = new Car3(car);
//        car3.move();

//        Car car = new Car();
//        CarTimeProxy ctp = new CarTimeProxy(car);
//        CarLogProxy clp = new CarLogProxy(ctp);
//        clp.move();

        Car car = new Car();
        CarLogProxy clp = new CarLogProxy(car);
        CarTimeProxy ctp = new CarTimeProxy(clp);
        ctp.move();
    }
}
