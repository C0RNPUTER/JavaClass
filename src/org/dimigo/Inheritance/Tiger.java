package org.dimigo.Inheritance;

public class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }
    //Method Overriding
    public void bark (){
        System.out.println("어흥");
    }

    public void hunt (){
        System.out.println("사냥한다");
    }
}
