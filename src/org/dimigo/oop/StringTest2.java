package org.dimigo.oop;

public class StringTest2 {
    public static void main(String[] args) {
        String str = "디미고";
        str += "2학년 ";
        str += "5반 ";
        str += "왕재호";

        StringBuilder sb = new StringBuilder("디미고 ");
        sb.append("2학년 ").append("5반 ").append("왕재호");

        System.out.println(sb.toString());

        compareSpeed();
    }

    private static void compareSpeed() {
        long start = System.currentTimeMillis();

        String str = "abc";
        StringBuffer sb = new StringBuffer("abc");
        StringBuilder sb2 = new StringBuilder("abc");

        for(int i=0;i<100000000;i++){
            //str += "def";
            sb2.append("def");
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
