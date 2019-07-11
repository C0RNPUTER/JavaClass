package org.dimigo.Inheritance;

public class Animal {
    public String name;

    public Animal (String name){
        this.name = name;
    }

    public void eat(){
        System.out.println("냠냠");
    }

    public void sleep(){
        System.out.println("Zzz");
    }

    public void bark(){
        System.out.println("댕댕");
    }

    public String toString() {
        return "저는 " + name + "입니다.";
    }
}
