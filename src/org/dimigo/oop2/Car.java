package org.dimigo.oop2;

public class Car {
    //Static Field
    private static String company;
    //Instance Field
    private String name;

    //static block
    static {
        company = "현대기아";
        System.out.println("static block 호출");
    }

    public Car(String name) {
        this.name = name;
        System.out.println("constructor 호출");
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Car.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return company + " : " + name;
    }
}
