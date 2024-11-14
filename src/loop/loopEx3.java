package loop;

public class loopEx3 {

    public static void main(String[] args) {
        int i = 3;
        while (i < 34) {
            System.out.println(i + "를 3으로 나눴을 때 나머지: " + i % 3);
            i += 1;
        }
        System.out.println("----------");

        for (int j = 3; j < 34; j++) {
            System.out.println(j + "를 3으로 나눴을 때 나머지: " + j % 3);
        }
    }
}
