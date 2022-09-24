package OOPexercise;


//经理类
public class Manage extends Employee {

    private double bonus;

    public Manage(String name, double salary, int day, double grade ) {
        super(name, salary, day, grade);
    }

    @Override
    public String toString() {
        System.out.println("经理信息");
        return "员工名字："+getName() +" 工资为："+(bonus + getSalary() * getDay()) +" 等级为："+getGrade();
    }


    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

}
