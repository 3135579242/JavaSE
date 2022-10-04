package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {

        List list = new ArrayList();


        for (int i = 1; i <= 10 ; i++) {
            list.add("hello" + i);
        }
        System.out.println("list = " + list);
        list.add(1,"阿龙");
        System.out.println("list = " + list);
        System.out.println(list.get(4));

        System.out.println(list.remove(5));
        list.set(6,"楼兰");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }


    }
}
