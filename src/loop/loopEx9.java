package loop;

import java.util.Random;
import java.util.Scanner;

public class loopEx9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("< 1 ~ 50 사이 숫자 맞추기 업 앤 다운 게임 >");
        Random random = new Random();
        final int ANSWER = random.nextInt(50) + 1;// 1 ~ 50 사이의 임의의 정수


//        int guess;

        while (true){
            int guess = scanner.nextInt();
            if (guess > ANSWER){
                System.out.println("다운!");
            }
            else if(guess < ANSWER) {
                System.out.println("업!");
            }
            else {
                System.out.println("정답!");
                break;
            }
        }

//
//        while (guess != ANSWER){
//            guess = scanner.nextInt();
//            if (guess > ANSWER){
//                System.out.println("다운!");
//            }
//            else {
//                System.out.println("업!");
//            }
//        }
//        System.out.println("정답!");



    }
}

