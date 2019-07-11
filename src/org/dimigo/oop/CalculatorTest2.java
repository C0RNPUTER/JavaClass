package org.dimigo.oop;

public class CalculatorTest2 {
    public static void main(String[] args) {
        int q = 10, w= 20;

//        c.powerOn();
        Calculator2 calc = new Calculator2();
        System.out.printf("%d + %d = %d\n", q,w,Calculator2.add(q,w,calc));
        System.out.printf("%d - %d = %d\n", q,w,Calculator2.sub(q,w,calc));
        System.out.printf("%d * %d = %d\n", q,w,Calculator2.mul(q,w,calc));
        System.out.printf("%d / %d = %.1f\n", q,w,Calculator2.div(q,w,calc));
        calc.powerOff();
    }
}
