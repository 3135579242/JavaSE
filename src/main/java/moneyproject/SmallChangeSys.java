package moneyproject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        String key = "";
        String details = "------------零钱通明细------------";
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String note = "";


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
                    System.out.println(details);
                    break;
                }
                case "2" :{
                    System.out.print("收益入账金额");
                    money = scanner.nextDouble();
                    if (money <= 0){
                        System.out.println("金额不合法");
                        break;
                    }
                    balance += money;
                    date = new Date();
                    details = details + "\n收益入账\t+"+ money+ "\t " + sdf.format(date)+"\t"+"余额: "+balance;
                    break;
                }
                case "3" :{
                    System.out.print("消费金额 ");
                    money = scanner.nextDouble();
                    balance -= money;
                    if (money <= 0){
                        System.out.println("消费余额不能负数~");
                        break;
                    } else if (balance < money) {
                        System.out.println("你的钱没有那么多");
                        break;
                    }
                    date = new Date();
                    System.out.print("消费说明 ");
                    note = scanner.next();
                    details = details + "\n" + note +"\t-"+ money + "\t " + sdf.format(date)+"\t"+"余额: "+balance;

                    break;
                }
                case "4" :{
                    String choice = "";
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
                    break;
                }
                default : {
                    System.out.println("输入有误~");
                }
            }

        }while (loop);

        System.out.println("退出了零钱通~");
    }

}
