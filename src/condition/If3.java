package condition;

import java.util.Scanner;

public class If3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("주문 수량: ");
        int quantity = scanner.nextInt();
        int stock = 3;
        // 아래에 코드 작성
        if(quantity > 3){
            System.out.println("주문 불가");
        } else if (quantity <= 3) {
            int totalStock = stock - quantity;
            System.out.println("재고: " + totalStock);
        }
    }
}
