package Debug;

public class Debug01 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + i;
            System.out.println(i);
            System.out.println(sum);
        }
        System.out.println("退出");
    }
}

