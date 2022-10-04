package collection;

import collection.list.Book;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(new Book("三个演绎","阿龙",10.1));
        collection.add(new Book("小李飞刀","大龙",12.6));
        collection.add(new Book("红楼梦","小龙",15.2));

        for (Object obj : collection){
            System.out.println(obj);
        }


    }
}
