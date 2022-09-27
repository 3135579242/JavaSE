package innerClass;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        f1(new AA() {
            @Override
            public void show() {
                System.out.println("show");
            }
        });

    }

    public static void f1(AA aa) {
        aa.show();
    }
}

interface AA{
    void show();
}