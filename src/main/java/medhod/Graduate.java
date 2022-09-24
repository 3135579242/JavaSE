package medhod;

public class Graduate {
    String name;
    int age;
    double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void testing() {
        System.out.println("大学生 "+name + " 在考试");
    }

    @Override
    public String toString() {
        return "Graduate{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
