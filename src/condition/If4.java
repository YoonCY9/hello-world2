package condition;

public class If4 {

    public static void main(String[] args) {

        int age = 25;
        char gender = 'm';
        if (age > 20 && gender == 'm'){
            System.out.println("입영대상");
        }
        int y = 1;
        if (true) {
            y = 7;                 // ✅
            System.out.println(y); // ✅
        }
        System.out.println(y);

    }
}
