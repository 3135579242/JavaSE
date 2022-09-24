package OOPexercise;

public class Homework03 {
    public static void main(String[] args) {
        Teacher teacher = new Professor("阿龙",18,"工人",300,1.3);
        Teacher teacher1 = new DepProfessor("阿龙",18,"工人",300,1.2);
        Teacher teacher2 = new lecturer("阿龙",18,"工人",300,1.1);
        System.out.println(teacher.introduce());
        System.out.println(teacher1.introduce());
        System.out.println(teacher2.introduce());
    }
}

//讲师类
class lecturer extends Teacher{
    private double grade;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public lecturer(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary);
        this.grade = grade;
    }

    @Override
    public String introduce() {
        return super.introduce() +" 工资级别为："+ grade;
    }
}

//副教授类
class DepProfessor extends Teacher {
    private double grade;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public DepProfessor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary);
        this.grade = grade;
    }

    @Override
    public String introduce() {
        return super.introduce() +" 工资级别为："+ grade;
    }
}

//教授类
class Professor extends Teacher {
    private double grade;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Professor(String name, int age, String post, double salary,double grade) {
        super(name, age, post, salary);
        this.grade = grade;
    }

    @Override
    public String introduce() {
        return super.introduce() +"工资级别为："+ grade;
    }
}



//老师类
class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String introduce() {
        return "Teacher{" +
                "名字='" + name + '\'' +
                ", 岁=" + age +
                ", 职称='" + post + '\'' +
                ", 工资=" + salary +
                '}';
    }
}
