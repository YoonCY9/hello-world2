package loop;

public class loopEx2 {

    public static void main(String[] args) {
        int i = 10;
        while (i >= 0) {
            System.out.println("i의 값: " + i);
            i = i - 1;
        }
        System.out.println("---------");

        for (int j = 10; j >= 0; j--) {
            System.out.println("j의 값: " + j);
        }
    }
}
