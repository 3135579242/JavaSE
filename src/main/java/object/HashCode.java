package object;

public class HashCode {
    public static void main(String[] args) {
        A a = new A();
        A a2 = new A();
        System.out.println("a2 = " + a2.hashCode());
        System.out.println("a = " + a.hashCode());

    }
}
class A {}
