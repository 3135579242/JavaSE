package OOPexercise;


//员工类
public class Employee {

    //姓名
    private String name;

    //工资
    private double salary;

    //天
    private int day;
    //等级
    private double grade;

    public Employee(String name, double salary, int day, double grade) {
        this.name = name;
        this.salary = salary;
        this.day = day;
        this.grade = grade;
    }


    @Override
    public String toString() {
        return "工资为："+salary * day +"等级为："+grade;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
