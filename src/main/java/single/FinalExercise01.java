package single;

import java.util.Scanner;

public class FinalExercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        circle.setRadius(scanner.nextDouble());
        System.out.println(circle.tod());




    }
}

class Circle{
    double sum = 0;
    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double tod() {
        return sum = PI * radius * radius;
    }
}
