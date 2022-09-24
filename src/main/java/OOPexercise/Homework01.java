package OOPexercise;

import java.util.Arrays;

public class Homework01 {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("jack",33,"小白");
        person[1] = new Person("smithg",35,"入门");
        person[2] = new Person("along",22,"努力");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
        System.out.println("=================");
        Person temp = null;
        for (int i = 0; i < person.length -1 ; i++) {
            for (int j = 0; j <= i; j++) {
                //  18 20 22  //
                if (person[i].getName().length() > person[i+1].getName().length()){
                    temp = person[i];
                    person[i] = person[i +1];
                    person[i+1] = temp;
                }
            }
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }

    }
}
class Person {


    private String name;
    private int age;
    private String job;


    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}