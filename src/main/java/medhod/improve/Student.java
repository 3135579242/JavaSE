package medhod.improve;


//父类
public class Student {
    String name;
    int age;
    double score;

    public void setScore(double score) {
        this.score = score;
    }





    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
