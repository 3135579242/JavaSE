package Homework;

public class Homework04 {
    public static void main(String[] args) {
        new Cellphone(){
            @Override
            public void testWork(Calculate calculate) {

            }
        };
    }
}

interface Calculate {
    double work(double n1 , double n2);
}

class Cellphone {
    public void testWork(Calculate calculate){
        calculate.work(1,1);
    }
}
