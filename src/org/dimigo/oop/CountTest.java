package org.dimigo.oop;

public class CountTest {
    public static void main(String[] args) {
        Count c1= new Count();
        Count c2= new Count();
        Count c3= new Count();

        System.out.println(Count.getQ());

        for(int i=0;i<10;i++){
            new Count();
        }
        System.out.println(Count.getQ());
    }
}
