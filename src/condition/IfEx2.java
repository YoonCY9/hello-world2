package condition;

import java.util.Scanner;

public class IfEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // -----------------------------------------------------------------
        // light가 r(red)이면 "정지"를 출력하고,
        // 아니면 y(yellow)이면 "감속"을 출력하고,
        // 그것도 아니면 "주행"을 출력한다.
//        System.out.print("신호등 색깔을 입력하세요(r/y/g): ");
//        char light = scanner.next().charAt(0);
//        // 아래에 코드 작성
//        if (light == 'r'){
//            System.out.println("정지");
//        } else if (light == 'y') {
//            System.out.println("감속");
//        } else {
//            System.out.println("주행");
//        }
//

//        // -----------------------------------------------------------------
//        /*
//         * isSchoolZone이 true일 때 speed가 30보다 크면 "과속"을 출력한다.
//         * isSchoolZone이 false일 때 speed가 50보다 크면 "과속"을 출력한다.
//         * */
//        System.out.print("어린이보호구역 여부를 입력하세요(true / false): ");
//        boolean isSchoolZone = scanner.nextBoolean();
//        System.out.print("속도를 입력하세요: ");
//        int speed = scanner.nextInt();
//        // 아래에 코드 작성
//        if (isSchoolZone && speed > 30){
//            System.out.println("과속");
//        }if (!isSchoolZone && speed > 50){
//            System.out.println("과속");
//        }
//
//        // -----------------------------------------------------------------
//        /*
//         * score가 90(점) 이상이면, "A"를 출력한다.
//         * score가 80(점) 이상 90(점) 미만이면, "B"를 출력한다.
//         * score가 70(점) 이상 80(점) 미만이면, "C"를 출력한다.
//         * score가 70(점) 미만이면, "F"를 출력한다.
//         * */
//        System.out.print("시험 점수를 입력하세요: ");
//        int score = scanner.nextInt();
////        // 아래에 코드 작성
//        if (score >= 90){
//            System.out.println("A");
//        } else if (score >= 80) {
//            System.out.println("B");
//        } else if (score >= 70) {
//            System.out.println("C");
//        } else {
//            System.out.println("F");
//        }
//

        // -----------------------------------------------------------------
        // 카페 음료 주문 시스템
        // size가 'S', 'M', 'L' 중 하나가 아니면 "잘못된 입력"을 출력한다
        // 정상적인 입력일 경우,
        // isHot이 true이면 기본가격에 500원을 추가한다
        // size가 'M'이면 기본가격에 1000원을, 'L'이면 2000원을 추가한다
//        System.out.print("음료 크기를 입력하세요(S/M/L): ");
//        char size = scanner.next().charAt(0);
//        System.out.print("따뜻한 음료인가요?(true/false): ");
//        boolean isHot = scanner.nextBoolean();
//        int basePrice = 3000;
//
//        // 아래에 코드 작성
//        int totalPrice = basePrice;
//        if(size == 'S' || size == 'M' || size == 'L'){
//            if (isHot){
//                totalPrice = basePrice + 500;
//            }if (size == 'M'){
//                totalPrice = basePrice + 1000;
//            }if (size == 'L') {
//                totalPrice = basePrice + 2000;
//            }
//            System.out.println(totalPrice + "원");
//        }else {
//            System.out.println("잘못된 입력");
//        }
//


        // -----------------------------------------------------------------
        // 영화관 할인 시스템
        // 나이가 65세 이상이면 50% 할인
        // 나이가 8세 이하면 무료
        // 학생이면 30% 할인 (다른 할인과 중복 안됨)
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();
        System.out.print("학생인가요?(true/false): ");
        boolean isStudent = scanner.nextBoolean();
        int moviePrice = 12000;
        // 아래에 코드 작성
        int totalMoviePrice = moviePrice;
        if (age >= 65) {
            totalMoviePrice = moviePrice / 2;
        }else if (age <= 8) {
            totalMoviePrice = 0;
        }else if (isStudent) {
            totalMoviePrice = (moviePrice / 100) * 70 ;
        }
        System.out.println(totalMoviePrice + "원");


    }
}
