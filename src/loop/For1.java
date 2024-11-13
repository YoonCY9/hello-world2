package loop;

public class For1 {

    public static void main(String[] args) {
//        for (int i = 0; i < 9; i++) {
//            System.out.println(i + 1);
//        }

        for (int i = 2; i <= 9; i++) {
            System.out.println("----------");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " +i*j);
            }
        }
    }
}
