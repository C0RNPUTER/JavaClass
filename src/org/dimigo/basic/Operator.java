package org.dimigo.basic;

public class Operator {
    public static void main(String[] args) {
        //산술연산자
        int a =5, b=2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        System.out.println((double)a/b);

        boolean flag = true;
        a=10;
        b=0;
        if(flag || (a/b)==0){
            System.out.println("OR 연산");
        }
        if(!flag && (a/b==0)){
            System.out.println("AND연산");
        }

        String school = "디미고";
        int grade = 2;
        int ban = 5;
        String name = "이욱준";
        System.out.println(school + grade + ban + name);
        System.out.println(grade + (ban + school) + name);
        System.out.println("" + grade + ban + school + name);
    }
}
