public class CodeBlockExercise02 {
    public static void main(String[] args) {
        Test test = new Test();
    }

}
class Sample{
    Sample(String s){
        System.out.println(s);
    }
    Sample(){
        System.out.println("默认无参");
    }
}


class Test{
    Sample sample1 = new Sample("sample1初始化");//4
    static Sample sample2 = new Sample("sample2静态初始化");//1
    static {
        System.out.println("static执行");//2
        if (sample2 == null){
            System.out.println("null");//3
        }
    }
    Test(){


        System.out.println("test默认无参");//5
    }

}
