package loop;

import java.util.Random;
import java.util.Scanner;

public class loopEx10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int count = 0;
        int win = 0;
        int lose = 0;
        int same = 0;
        while (true) {
            int com = random.nextInt(3) ;
            System.out.print("가위, " + "바위, " + "보 중 하나를 선택하세요(종료 입력 시 게임 종료): ");
            String user = scanner.nextLine();
            if (user.equals("종료")){
                break;
            }

            if (com == 0) {
                System.out.println("컴퓨터의 선택: 가위");
            } else if (com == 1) {
                System.out.println("컴퓨터의 선택: 바위");
            } else {
                System.out.println("컴퓨터의 선택: 보");
            }

            if (user.equals("가위")) {
                if(com == 0){
                    System.out.println("무승부");
                    same++;
                } else if (com == 1) {
                    System.out.println("컴퓨터 승");
                    lose++;
                } else {
                    System.out.println("너 승");
                    win++;
                }
            }
            if (user.equals("바위")) {
                if(com == 0){
                    System.out.println("너 승");
                    win++;
                } else if (com == 1) {
                    System.out.println("무승부");
                    same++;
                } else {
                    System.out.println("컴퓨터 승");
                    lose++;
                }
            }
            if (user.equals("보")) {
                if (com == 0){
                    System.out.println("컴퓨터 승");
                    lose++;
                } else if (com == 1) {
                    System.out.println("너 승");
                    win++;
                } else {
                    System.out.println("무승부");
                    same++;
                }
            }
        count++;
        }
        System.out.println("총 게임수: " + count + "," + " 승리:" + win + "," + " 패배:" + lose + "," + " 무승부:" + same);


    }
}
