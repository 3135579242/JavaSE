package moneyproject.OOP;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 完成功能类
 */
public class SmallChangeSysOOP {
    Scanner scanner = new Scanner(System.in);
    boolean loop = true;
    String key = "";
    String details = "------------零钱通明细------------";
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String note = "";
    String choice = "";

    //菜单
    public void mainMenu(){
        do {
            System.out.println("===零钱通=菜单==");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益 入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");
            System.out.print("请选择(1-4) ");
            key = scanner.next();

            switch (key) {
                case "1" :{
                    detail();
                    break;
                }
                case "2" :{
                    income();
                    break;
                }
                case "3" :{
                    pay();
                    break;
                }
                case "4" :{
                    exit();
                    break;
                }
                default : {
                    System.out.println("输入有误~");
                }
            }

        }while (loop);
    }
    //明细
    public void detail(){
        System.out.println(details);
    }
    //收益入账
    public void income(){
        System.out.print("收益入账金额");
        money = scanner.nextDouble();
        if (money <= 0){
            System.out.println("金额不合法");
            return;
        }
        balance += money;
        date = new Date();
        details = details + "\n收益入账\t+"+ money+ "\t " + sdf.format(date)+"\t"+"余额: "+balance;
    }
    //消费
    public void pay(){
        System.out.print("消费金额 ");
        money = scanner.nextDouble();
        if (money <= 0 || money > balance){
            System.out.println("消费余额不能负数~或者你的消费余额必须在1~"+balance+"之间");
            return;
        }
        date = new Date();
        System.out.print("消费说明 ");
        balance -= money;
        note = scanner.next();
        details = details + "\n" + note +"\t-"+ money + "\t " + sdf.format(date)+"\t"+"余额: "+balance;

    }
    //退出
    public void exit(){
        while (true){
            System.out.println("确定退出吗输入? y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)){
                break;
            }
        }
        if (choice.equals("y")){
            loop = false;
        }
        System.out.println("程序退出");
    }

}
