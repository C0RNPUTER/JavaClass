package org.dimigo.interfaces;

public interface IAnimal {
    //상수(자동으로 public static final이 붙음)
    String FARM_NAME = "디미 동물농장";

    static void welcome(){
        System.out.println("ㅎㅇㅎㅇ");
    }

    default void eat() {
        System.out.println("옴놈놈놈");
    }

    default void sleep() {
        System.out.println("드르렁");
    }

    //public abstract void eat();
    //public void sleep();
    void bark();
}