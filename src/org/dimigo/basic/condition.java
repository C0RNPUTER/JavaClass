package org.dimigo.basic;

        import java.util.Random;

public class condition {
    public static void main(String[] args) {
        int age = 17;
        if(age>=19)
            System.out.println("당신과 당신 그리고 당신도 투표하십시오");
        else
            System.out.println("너흰 아직 준비가 안됐다");


        //switch
        int num= new Random().nextInt( 6 )+1;
        System.out.println(num);
        switch(num%2){
            case 0 :
                System.out.println("짝");
                break;
            case 1 :
                System.out.println("홇");
                break;
            default:
                System.out.println("아옳옳옳");
        }

        String menu = "떡볶이";
        switch (menu){
            case "떡볶이":
                System.out.println("떡볶이 선택");
                break;
            case "순대":
                System.out.println("순대 선택");
                break;
            default:
                System.out.println("김말이가 더 맛있음");
        }

    }
}
