package single;

public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance.toString());
    }

}

class GirlFriend{
    private String name;

    private GirlFriend(String name) {
        this.name = name;
    }

    private static GirlFriend gf = new GirlFriend("小李");

    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
