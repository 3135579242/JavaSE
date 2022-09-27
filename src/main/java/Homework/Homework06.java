package Homework;

import houserent.entity.House;
import org.example.Day2.B;

public class Homework06 {
    public static void main(String[] args) {
        Person person = new Person("唐曾",new Boat());
        person.common();
        person.passRiver();
    }
}

interface Vehicles {
    void work();
}
class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("马");
    }
}
class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("船");
    }
}
class TrafficFactory {

    private static Horse horse = new Horse();

    private TrafficFactory(){}

    public static   Horse getHouse( ){
        return horse;
    }
    public static   Boat getBoat( ){
        return new Boat();
    }

}
class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void passRiver(){
        if (!(vehicles instanceof Boat)){
            vehicles = TrafficFactory.getBoat();
        }
        vehicles.work();
    }
    public void common(){
        if (!(vehicles instanceof Horse)){
            vehicles = TrafficFactory.getHouse();
        }
        vehicles.work();
    }
}
