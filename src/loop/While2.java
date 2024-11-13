package loop;

public class While2 {

    public static void main(String[] args) {
        int i = 1;
        while (true) {
            if (i >= 6) {
                break;
            }

            System.out.println(i + "번째 실행됨");
            i = i + 1;
        }
    }
}
