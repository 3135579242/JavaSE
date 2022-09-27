package Homework;

import org.example.Day2.B;
import org.omg.CORBA.PUBLIC_MEMBER;

public class Homework05 {
    public static void main(String[] args) {
        A a = new A();
        a.test();


    }
}
class A {

    private String name = "李";

    public void test(){

        class B {
            final String name = "阿龙";



            public void show(){
                System.out.println(A.this.name);
                System.out.println(name);
            }

        }
        B b = new B();
        b.show();
    }

}
