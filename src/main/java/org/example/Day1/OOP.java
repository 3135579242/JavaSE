package org.example.Day1;

public class OOP {
    public static void main(String[] args) {

    }
}

class Teacher extends Person {

}

class Student extends Person{

    private int a = 1;

    public void test(int a){
        System.out.println(this.a = a);
    }

}

class Person{
    private int id ;
    public void say(){
        System.out.println("说话了");
    }

}

