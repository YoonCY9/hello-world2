import java.time.LocalDate;

public class Variable {

    public static void main(String[] args) {

        int student = 20;
        System.out.println("수강생 수는 " + student + "명입니다.");
        student = 25;
        System.out.println("수강생 수는 " + student + "명입니다.");

        System.out.println();

        String name = "박효신";
        String nationality = "대한민국";
        int height = 178;
        System.out.println("이름: " + name);
        System.out.println("국적: " + nationality);
        System.out.println("키: " + height);

        LocalDate 개봉일 = LocalDate.parse("2024-10-01");
        System.out.println(개봉일);
        
        int 연봉 = 5400;
        int 월급 = 연봉 / 13;
        System.out.println("월급 = " + 월급);
        월급 = 연봉 / 12;
        System.out.println("월급 = " + 월급);
        
        int 상품구매수량 = 1;
        상품구매수량 += 1;
        상품구매수량 += 1;
        상품구매수량 += 1;
        상품구매수량 += 1;
        System.out.println("상품구매수량 = " + 상품구매수량);

        int 나이 = 20;
        나이 += 1;
        System.out.println("나이 = " + 나이);

        int count = 5;
        count -= 1;
        count -= 1;
        count -= 1;
        count -= 1;
        count -= 1;
        System.out.println("count = " + count);

        int 온도 = 20;
//        온도 = 온도 - (온도 * 2);
        온도 = -온도;
        System.out.println(온도);

        int a = 3;
        int b = 6;
        int c = 9;

        int d = a; // d = 3
        a = c; // a = 9
        c = b; // c = 6
        b = d; // b = 3

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        int a1 = 100;
        int b1 = 0;

        int c1 = a1; // c1 = 100
        a1 = b1; // a1 = 0
        b1 = c1; // b1 = 100
        System.out.println("a = " + a1);
        System.out.println("b = " + b1);





    }
}
