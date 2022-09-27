package single;

public class Main {
    public static void main(String[] args) {
        int a1 = A.a1;

    }
}
class  A {

    public static int a1 = 100;
    private String name;

    private A(String name) {
        System.out.println("aa");
        this.name = name;
    }

    private static A a ;

    public static A getInstance(){
        if (a == null){
            return a = new A("cai");
        }
        return a;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                '}';
    }

}
