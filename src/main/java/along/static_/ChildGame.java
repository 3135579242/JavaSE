package along.static_;

public class ChildGame {



    public static void main(String[] args) {
        int count = 0;

        Child child1 = new Child("蔡徐坤");
        child1.join();

        child1.count++;
        Child child2 = new Child("古巨基");
        child2.join();
        child1.count++;
        Child child3 = new Child("吴亦凡");
        child3.join();
        child1.count++;

        System.out.println(Child.count);

    }
}
class Child {
    private String name;
    static int count = 0;
    public Child(String name){
        this.name = name;
    }

    public void join(){
        System.out.println(name + " 加入了游戏.. ");
    }

}
