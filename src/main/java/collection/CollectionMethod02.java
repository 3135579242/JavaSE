package collection;

import collection.list.Book;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethod02 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(new Book("三个演绎","阿龙",10.1));
        collection.add(new Book("小李飞刀","大龙",12.6));
        collection.add(new Book("红楼梦","小龙",15.2));

        //获得 collection 迭代器
        Iterator iterator = collection.iterator();
        //while 循环遍历
        while (iterator.hasNext()){// hasNext判断是否还有下一个数据 没有则退出
            Object object = iterator.next();
            System.out.println("object = " + object);
        }

        //重置迭代器 可以再次循环
        iterator = collection.iterator();

    }
}
