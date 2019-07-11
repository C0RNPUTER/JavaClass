package org.dimigo.abstractclass;

public class Cartest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setEngine(new BenzEngine());
        car.start();
        car.stop();
        System.out.println("엔진 갈아낌");
        car.setEngine(new BmwEngine());
        car.start();
        car.stop();
    }
}
