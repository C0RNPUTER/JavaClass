package org.dimigo.oop;

public class StringTest {
    public static void main(String[] args) {
        String dog1 = "야옹이";
        String dog2 = "야옹이";
        System.out.println(dog1 == dog2);

        String cat1 = new String("멍멍이");
        String cat2 = new String("멍멍이");
        System.out.println(cat1 == cat2);
        System.out.println(dog1.equals(dog2));
        System.out.println(cat1.equals(cat2));

        String id ="admin";
        System.out.println("admin".equalsIgnoreCase(id)?"관리자임" : "고나리자 아님");

        testString();

    }

    private static void testString() {
        //                 01234567890213
        String s = "abcdefgABCDEFG";

        System.out.println(s.length());
        System.out.println(s.substring(3));
        System.out.println(s.substring(3,6));
        System.out.println(s.indexOf("C"));//인덱스위치찾
        System.out.println(s.charAt(9));//9번째 인덱스 찾
        System.out.println(s.concat("ABC"));
        System.out.println("                    ABC                           ".trim());//공백제거
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.replace('a','A'));
    }
}
