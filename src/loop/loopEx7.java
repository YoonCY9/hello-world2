package loop;

public class loopEx7 {

    public static void main(String[] args) {

//        for (int i = 1; i <= 50 ; i++) {
//            if(i % 2 == 0){
//                System.out.println(i);
//            }

            for (int j = 1; j <= 50 ; j++) {
                if(j % 2 == 1){
                    continue;
                }
                System.out.println(j);
            }



        }
    }

