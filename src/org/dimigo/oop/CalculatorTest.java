package org.dimigo.oop;

public class CalculatorTest {
    public static void main(String[] args) {
        int q = 10, w= 20;
        Calculator c = new Calculator(q,w);

        c.powerOn();
        System.out.printf("%d + %d = %d\n", q,w,c.add());
        System.out.printf("%d - %d = %d\n", q,w,c.sub());
        System.out.printf("%d * %d = %d\n", q,w,c.mul());
        System.out.printf("%d / %d = %.1f\n", q,w,c.div());

    }
}
