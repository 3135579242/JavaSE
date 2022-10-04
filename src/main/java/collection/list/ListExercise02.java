package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("阿龙","楼兰",57.2));
        list.add(new Book("阿龙","楼兰",56.2));
        sort(list);

        for (Object o: list    ) {
            System.out.println(list);
        }

    }

    public static void sort(List list){
        int listSize = list.size();
        for (int j = 0; j < listSize - 1 ; j++) {
            for (int i = 0; i < listSize - 1 - j; i++) {
                Book book1 = (Book) list.get(i);
                Book book2 = (Book) list.get(i + 1);
                if (book1.getPrice() > book2.getPrice()){
                    list.set(i,book2);
                    list.set(i + 1,book1);
                }
            }
        }
    }
}
