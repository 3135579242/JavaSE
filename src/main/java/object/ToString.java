package object;

public class ToString {
    public static void main(String[] args) {
        Car car = new Car("阿龙");


        car = null;
    }
}

class Car {
    String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("释放资源");
    }
}
