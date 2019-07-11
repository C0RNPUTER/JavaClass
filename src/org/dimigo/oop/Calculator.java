package org.dimigo.oop;

public class Calculator {
    private int num1;
    private int num2;
    private boolean powerFlag;

    public Calculator(){

    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

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

    public int add(){
        powerOn();
        return num1+num2;
    }

    public int sub(){
        powerOn();
        return num1 - num2;
    }

    public int mul(){
        powerOn();
        return num1 * num2;
    }

    public double div(){
        powerOn();
        return (double)num1 / num2;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator (10,20);
        System.out.println(c.num1);
        System.out.println(c.num2);
        c.powerOn();
    }

}
