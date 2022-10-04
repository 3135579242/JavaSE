package collection.list;

import java.util.ArrayList;
import java.util.List;

public class List_ {
    public static void main(String[] args) {
        //List 集合类是有序的 内容也可以重复
        List list = new ArrayList();
        list.add("阿龙");
        list.add("楼兰");
        list.add("阿龙");
        //插入元素
        list.add(1,"路的尽头还是路");
        System.out.println("list = " + list);
        //获取指定下标元素
        System.out.println(list.get(1));
        //获取集合首次出现的下标
        System.out.println(list.indexOf("楼兰"));
        list.add("楼兰");
        System.out.println("list = " + list);
        //获取集合最后出现的下标
        System.out.println(list.lastIndexOf("楼兰"));
        //删除元素
        list.remove(0);
        System.out.println("list = " + list);
        //替换元素
        list.set(2,"小龙哥");
        System.out.println("list = " + list);
        //返回下标0 2-1 的长度内容
        System.out.println(list.subList(0, 2));

    }
}
