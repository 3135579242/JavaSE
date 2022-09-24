package houserent.service;

import houserent.entity.House;
import houserent.view.HouseView;

public class HouseService {

    private House[] houses;
    private int houseNums = 1;
    private int idCounter = 1;

    public HouseService(int size){
        houses = new House[size];
        houses[0] = new House(1,"阿龙","181","制造学院",1350,"未出租");
    }

    public House[] list(){
        return houses;
    }

    public House findById(int findId) {

        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }


    public boolean add(House newHouse){
        if (houseNums == houses.length){
            return false;
        }
        houses[houseNums++] = newHouse;
        newHouse.setId(++idCounter);
        return true;
    }

    public boolean del(int delId){

        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()){
                index = i;
            }
        }
        if (index == -1){
            return false;
        }
        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--houseNums] = null;

        return true;
    }


}
