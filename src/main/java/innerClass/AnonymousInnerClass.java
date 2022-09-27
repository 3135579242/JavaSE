package innerClass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04 {
    private int n1 = 10;
    public void method(){

        //匿名内部类接口演示
        IA dog = new IA() {
            @Override
            public void cry() {
                System.out.println("狗叫");
            }
        };
//        dog.cry();

        new Father("jack");
    }

}
//class Tiger implements IA {
//    @Override
//    public void cry() {
//        System.out.println("老虎叫");
//    }
//}
//class Dog implements IA{
//    @Override
//    public void cry() {
//        System.out.println("小狗叫");
//    }
//}

interface IA {
    void cry();
}

class Father {
    public Father(String name){

    }
    public void test(){

    }
}
