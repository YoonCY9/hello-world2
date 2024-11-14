package loop;

import java.util.Scanner;

public class loopEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");
         // 사용자에게 숫자를 입력받아 정수로 변환하여 input에 기억
// 아래에 코드 추가
        int age;
        while (true){
            int input = scanner.nextInt();
            age = input;
            if (input > 0){
                System.out.println("입력받은 age: " + age);
                break;
            }
        }
        System.out.println(age);
    }
}
