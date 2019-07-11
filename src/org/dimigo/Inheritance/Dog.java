package org.dimigo.Inheritance;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void wag(){
        System.out.println("꼬리를 흔든다");
    }
}
