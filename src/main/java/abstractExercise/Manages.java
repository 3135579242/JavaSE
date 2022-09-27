package abstractExercise;

public class Manages extends Employee {

    private double bonus;

    public Manages(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public Manages(String name) {
        super(name);
    }

    @Override
    public String  work() {

        return "经理："+getName() + " " +"工作中.....";
    }




    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
