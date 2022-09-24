package medhod;

public class Pupil {
    String name;
    int age;
    double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void testing() {
        System.out.println("小学生 "+name + " 在考试");
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
