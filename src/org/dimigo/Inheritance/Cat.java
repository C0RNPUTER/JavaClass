package org.dimigo.Inheritance;

public class Cat extends  Animal {
    public Cat(String name) {
        super(name);
    }

    //Method Overriding
    public void bark(){
        System.out.println("코옹코옹");
    }

    public void scratch(){
        System.out.println("후린다");
    }
}
