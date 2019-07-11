package org.dimigo.oop;

public class Calculator2 {

    //정적 필드 Static Field
    public static double PI = 3.141592;
    public  boolean powerFlag;

    //정적 메소드 Static Method
    public void powerOn(){
        if (!powerFlag) {
            System.out.println("전원을 켭네다");
            powerFlag = true;
        }
    }

    public void powerOff(){
        if(powerFlag) {
            System.out.println("전원을 끕네다");
            powerFlag = false;
        }
    }

    public static int add(int num1, int num2,Calculator2 c){
        c.powerOn();
        return num1+num2;
    }

    public static int sub(int num1, int num2, Calculator2 c){
        c.powerOn();
        return num1 - num2;
    }

    public static int mul(int num1, int num2, Calculator2 c){
        c.powerOn();
        return num1 * num2;
    }

    public static double div(int num1, int num2, Calculator2 c){
        c.powerOn();
        return (double)num1 / num2;
    }

//    public static void main(String[] args) {
//        Calculator2 c = new Calculator2(10,20);
//        System.out.println(c.num1);
//        System.out.println(c.num2);
//        c.powerOn();
//    }

}
