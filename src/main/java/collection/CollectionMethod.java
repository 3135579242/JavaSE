package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    public static void main(String[] args) {
        @SuppressWarnings({"all"})
        List list = new ArrayList();
        //add添加单个元素
        list.add("内容");
        list.add(10);
        list.add(true);
        System.out.println("list = " + list);
        //删除第一个元素
        list.remove(0);
        //删除指定元素
        list.remove("内容");
        System.out.println("list = " + list);

        //查找元素是否存在  返回 T F
        System.out.println(list.contains("内容"));
        //获取元素个数
        System.out.println(list.size());
        //判断集合是否为空
        System.out.println(list.isEmpty());
        //清空集合全部元素
        list.clear();
        System.out.println("list = " + list);
        List list2 = new ArrayList();
        //添加多个元素
        list2.add("阿龙");
        list2.add("楼兰");
        list.addAll(list2);
        System.out.println("list = " + list);
        //查找多个元素
        System.out.println(list.containsAll(list));
        //删除多个元素
        System.out.println(list.removeAll(list2));

        list.add("阿龙");
        System.out.println("list = " + list);
    }
}
