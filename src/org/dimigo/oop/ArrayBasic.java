package org.dimigo.oop;

public class ArrayBasic {
    public static void main(String[] args) {
        //기본형 : int, long, double, char, float, boolean, short - Primitive Type - 0 초기화
        //참조형: String, Book, Scanner, Random, StringBuilder - Referance Type - Null 초기화
        Book book  = null;
        Car car = null;

        int[] intArr = null;
        intArr = new int[5];

        printArray(intArr);

        //double타입 배열 생성 후 출력
        double[] dbArr = new double[5];
        for(double value : dbArr){
            System.out.print(value +" ");
        }
        System.out.println();

        //배열 선언 시 초기화
        int[] intArr2 = {1, 2, 3, 4, 5};
        int[] intArr3 = new int [] {1, 2, 3, 4, 5};

        printArray(intArr2);

        //참조형 배열
        String[] strArr = new String[3];
        printArray(strArr);

        strArr[0] = "BTS";
        strArr[1] = "EXO";
        strArr[2] = "빨간사춘";
        printArray(strArr);

        String[] strArr2 = {"BTS", "EXO", "빨간사춘"};
        String[] strArr3 = new String[] {"BTS", "EXO", "빨간사춘"};
        printArray(strArr2);

        //Book 타입 2개짜리 배열 생성
        //각 방에 Book 객체 생성 후 출력
        Book[] bookArr = new Book[2];
        bookArr[0] = new Book("수학의 바이블","김재영",300);
        bookArr[1] = new Book("워드마스터","전유원",200);

        printArray(bookArr);

        Book[] bookArr2 = new Book[]{
                new Book("531Project","김재영",100),
                new Book("Sense Up","전유원",100)
        };

        printArray(bookArr2);

        //배열 사용시 주의 사항
        int[] intArr1 = null;
     //System.out.println(intArr.length);

        intArr1 = new int[3];
  //   System.out.println(intArr1[3]);

    }

    private static void printArray(int[] intArr) {
        for(int value : intArr){
            System.out.print(value +" ");
        }
        System.out.println();
    }
    private static void printArray(String[] strArr) {
        for(String value : strArr){
            System.out.print(value +" ");
        }
        System.out.println();
    }
    private static void printArray(Book [] bookArr) {
        for(Book value : bookArr) {
            System.out.println(value);
        }
    }

}
