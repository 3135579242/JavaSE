package collection.Set_;

import java.util.HashSet;
import java.util.Set;

public class SetMethod {
    public static void main(String[] args) {
        Set set = new HashSet();
        //添加顺序和取出顺序不一样
        set.add("阿龙");
        set.add("楼兰");
        set.add("阿龙");
        set.add(null);
        set.add(null);
    }
}
