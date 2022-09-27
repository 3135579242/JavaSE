package Homework;

public class Homework03 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.shout();
        dog.shout();
    }
}

abstract class Animal {
    abstract void shout();
}
class Cat extends Animal {
    @Override
    void shout() {
        System.out.println("猫叫");
    }
}

class Dog extends Animal{
    @Override
    void shout() {
        System.out.println("狗叫");
    }
}
