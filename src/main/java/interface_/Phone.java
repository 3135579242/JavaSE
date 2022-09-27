package interface_;

public class Phone implements USB {


    @Override
    public void start() {
        System.out.println("开机");
    }

    @Override
    public void stop() {
        System.out.println("关机");
    }
}
