package innerClass;

import org.example.Day2.B;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("起床了");
            }
        });
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("上课了");
            }
        });

    }
}

interface Bell{
    void ring();
}

class Cellphone{
    public void alarmclock(Bell bell){
        bell.ring();
    }
}
