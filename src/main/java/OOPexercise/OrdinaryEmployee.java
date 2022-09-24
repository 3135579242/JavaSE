package OOPexercise;

//普通员工类
public class OrdinaryEmployee extends Employee {

    public OrdinaryEmployee(String name, double salary, int day, double grade) {
        super(name, salary, day, grade);
    }

    @Override
    public String toString() {
        System.out.println("员工信息");
        return "员工名字："+getName() +" 工资为："+(getSalary() * getDay()) +" 等级为："+getGrade();
    }
}
