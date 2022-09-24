package org.example.Day1;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                System.out.println("请选择加减乘除");
                System.out.println("1，加");
                System.out.println("2，减");
                System.out.println("3，乘");
                System.out.println("4，除");
                System.out.println("输入其他数退出");
                switch (scanner.nextLine()) {
                    case "1": {
                        System.out.println("请先输入 加数 ，回车后输入 被加数");
                        add(scanner.nextInt(), scanner.nextInt());
                        break;
                    }
                    case "2": {
                        System.out.println("请先输入 减数 ，回车后输入 被减数");
                        minus(scanner.nextInt(), scanner.nextInt());
                        break;
                    }
                    case "3": {
                        System.out.println("请先输入 乘数 ，回车后输入 被乘数");
                        multiply(scanner.nextInt(), scanner.nextInt());
                        break;
                    }
                    case "4": {
                        System.out.println("请先输入 除数 ，回车后输入 被除数");
                        remove(scanner.nextInt(), scanner.nextInt());
                        break;
                    }
                    default: {
                        System.out.println("结束");
                    }
                }
    }


    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void minus(int a, int b) {
        System.out.println(a - b);
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void remove(int a, int b) {
        System.out.println(a / b);
    }


}
