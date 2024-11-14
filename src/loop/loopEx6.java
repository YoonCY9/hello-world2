package loop;

import java.util.Scanner;

public class loopEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("반복 중입니다.");
            System.out.print("종료하시겠습니까?(y/n): ");
            char input = scanner.nextLine().charAt(0);
            // 아래에 코드 추가
            if(input == 'y'){
                break;
            }

        }
        System.out.println("반복이 종료되었습니다.");
    }
}
