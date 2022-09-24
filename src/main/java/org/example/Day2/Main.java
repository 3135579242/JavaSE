package org.example.Day2;

public class Main {
    public static void main(String[] args) {
        Object a = new A();
        System.out.println(a instanceof A);
        System.out.println(a instanceof B);
        System.out.println(a instanceof Object);
        System.out.println(a instanceof C);
        System.out.println(a instanceof String);
    }
}
