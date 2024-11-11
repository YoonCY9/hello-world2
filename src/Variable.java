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
    }
}
