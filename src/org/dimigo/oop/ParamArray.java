package org.dimigo.oop;

public class ParamArray {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        add(intArr, 10);
        printArray(intArr);

        String[] names = {"홍길동", "홍길서", "홍길남", "홍길북"};
        changeName(names, "김");
        printArray(names);
    }
    public  static  void printArray(int[] intArr){
        for(int value : intArr){
            System.out.print(value + " | ");
        }
    }

    public static void printArray(String[] strArr){
        for(String value : strArr){
            System.out.print(value + " | ");
        }
    }

    public static void changeName(String[] strArr,String str){
        for(int q=0;q<strArr.length;q++){
            //strArr[q].replaceFirst("홍","김");
            strArr[q] = str + strArr[q].substring(1);
        }
    }

    private static void add(int intArr[], int a){
        for(int q=0;q<intArr.length;q++){
            intArr[q] += a;
        }
    }
}
