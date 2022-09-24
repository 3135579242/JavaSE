package medhod;

public class Encapsulation01 {
    public static void main(String[] args) {
        P p = new P("阿龙","222222",21);
        System.out.println(p);
    }
}

class P{
    private String name;
    private String age;
    private double salary;

    public P() {
    }

    public P(String name, String age, double salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <=6){
            this.name = name;
        }else {
            System.out.println("长度在2-6 ， 已经给你默认值为：小刺老 ");
            this.name = "小刺老";
        }
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        if (age.length() == 6){
            this.age = age;
        }else {
            System.out.println("密码错误自动默认值为；000000");
            this.age = "000000";
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 20){
            this.salary = salary;
        }else {
            System.out.println("余额错误必须20块以上");
        }
    }

    @Override
    public String toString() {
        return "P{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", salary=" + salary +
                '}';
    }
}
