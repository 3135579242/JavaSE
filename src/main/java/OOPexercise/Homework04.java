package OOPexercise;

public class Homework04 {
    public static void main(String[] args) {
        Employee ordinaryEmployee = new OrdinaryEmployee("阿龙",100,30,1.0);
        System.out.println(ordinaryEmployee);

        Manage manage = new Manage("阿龙",200,30,1.2);
        manage.setBonus(4000);
        System.out.println(manage);
    }
}
