package org.dimigo.basic;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        for(int i = 2; i<=9;i++){
            for(int j = 1; j<=9;j++){
                System.out.printf("%d * %d = %d  ", i , j, j*i);
            }
            System.out.printf("\n");
        }

        //for each문
        int[] arr = {1,2,3,4,5};
        for(int i=0; i<arr.length; i++)
            System.out.println(arr[i]);

        for(int value : arr) {
            System.out.print(value + " ");
        }

        //대통령 출력
        String[] presi = {"이승만", "박정희", "전두환", "노태우", "김영삼", "김대중", "노무현", "이명박", "박근혜", "문재인"};
        for(String dent : presi){
            System.out.print(dent + " ");
        }

        //while do-while
        //맨유 처리
        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        do {
            System.out.println("<< 간식 선택 >>");
            System.out.println("1. 치킨");
            System.out.println("2. 냉면");
            System.out.println("3. 피자");
            System.out.println("9. 종료");
            System.out.print("메뉴 선택 => ");
            menu = scanner.nextInt();

            switch(menu){
                case 1 :
                    System.out.println("치킨을 선택했습니다");
                    break;
                case 2 :
                    System.out.println("냉띤을 선택했습니다");
                    break;
                case 3 :
                    System.out.println("괴자를 선택했습니다");
                    break;
                case 9 :
                    System.out.println("끄짐");
                    scanner.close();//메모리 관리용
                    break;
                default:
                    System.out.println("적혀있는 거 누르십시오");
                    break;
            }
        }while(menu != 9);{

        }
    }
}
