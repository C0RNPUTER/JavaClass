package org.dimigo.oop;

public class TwinArray {
    public static void main(String[] args) {
        //int 2차원 배열
        int[][] intArr = new int[2][3];
        printArray(intArr);

        intArr[0][1] = 100;
        intArr[1][2] = 90;
        printArray(intArr);

        //String 2차원 배열
        String[][] strArr = new String[2][];
        strArr[0] = new String[3] ;
        strArr[1] = new String[2];
        strArr[0][0] = "C";
        strArr[0][1] = "C++";
        strArr[0][2] = "JAVA";
        strArr[1][0] = "PHP";
        strArr[1][1] = "C#";
        printarray(strArr);

        String[][] strArr2 = {
                {"C#", "C++", "JAVA"},
                {"PHP", "C#"}
        };
        String[][] strArr3 = new String[][] {
                {"C#", "C++", "JAVA"},
                {"PHP", "C#"}
        };
        String[][] strArr4 = {
                new String[]{"C#", "C++", "JAVA"},
            new String[]{"PHP", "C#"}
        };


    }

    private static void printarray(String[][] strArr) {
        for(String[] arr : strArr){
            for(String value : arr)
                System.out.print(value + " | ");
            System.out.println();
        }
        System.out.println("-------------------");
    }

    public static void printArray(int[][] intArr) {
//        for(int q =0; q<intArr.length; q++){
//            for(int w=0;w<intArr[q].length;w++){
//                System.out.print(intArr[q][w] + " | ");
//            }
//        }
        for(int[] arr : intArr){
            for(int value : arr)
                System.out.print(value + " | ");
            System.out.println();
        }
        System.out.println("-------------------");
    }
}
