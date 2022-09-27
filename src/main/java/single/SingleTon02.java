package single;

import org.example.Day2.C;

public class SingleTon02 {
    public static void main(String[] args) {

        Cat instance = Cat.getInstance();
        System.out.println(instance.toString());

        Cat instance1 = Cat.getInstance();
        System.out.println(instance1.toString());

    }
}

class Cat {
    private String name;
    private static  Cat cat;

    private Cat(String name) {
        System.out.println("被调用");
        this.name = name;
    }
    private Cat() {
    }

    public static Cat getInstance() {
        if (cat == null) {
            cat = new Cat("大花猪");

        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
