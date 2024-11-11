package condition;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("음료 크기를 입력하세요(S/M/L): ");
        char size = scanner.next().charAt(0);
        System.out.print("따뜻한 음료인가요?(true/false): ");
        boolean isHot = scanner.nextBoolean();
        int basePrice = 3000;

        // 아래에 코드 작성
        int totalPrice = basePrice;
        if(size == 'S' || size == 'M' || size == 'L'){
            if (isHot){
                totalPrice = basePrice + 500;
            }if (size == 'M'){
                totalPrice = basePrice + 1000;
            } else if (size == 'L') {
                totalPrice = basePrice + 2000;
            }
            System.out.println(totalPrice + "원");
        }else {
            System.out.println("잘못된 입력");
        }

    }
}
