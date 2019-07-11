package org.dimigo.interfaces;

public class Dog implements IAnimal {


    @Override
    public void bark() {
        System.out.println("왈왈");
    }

    public  void wag() {
        System.out.println("꼬리치기");
    }
}
