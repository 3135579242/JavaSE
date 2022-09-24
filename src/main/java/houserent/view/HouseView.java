package houserent.view;

import houserent.entity.House;
import houserent.service.HouseService;
import houserent.utils.Utils;

import javax.rmi.CORBA.Util;

public class HouseView {

    private boolean loop = true;//控制页面显示
    private char key = ' ';     //接受用户选择
    private HouseService houseService = new HouseService(2);

    //根据ID修改房屋信息
    public void update(){
        System.out.println("请选择修改房屋编号(-1退出)");
        int updateId = Utils.readInt();
        if (updateId == -1){
            System.out.println("放弃");
            return;
        }

        House byId = houseService.findById(updateId);
        if (byId == null) {
            System.out.println("编号不存在");
            return;
        }
        System.out.print("姓名("+byId.getName()+"): ");
        String name = Utils.readString(8," ");
        if (!"".equals(name)){
            byId.setName(name);
        }

        System.out.print("电话("+byId.getPhone()+"):");
        String phone = Utils.readString(12," ");
        if (!"".equals(phone)){
            byId.setPhone(phone);
        }

        System.out.print("地址("+byId.getAddress()+"):");
        String address = Utils.readString(20," ");
        if (!"".equals(address)){
            byId.setAddress(address);
        }

        System.out.print("月租("+byId.getRent()+"):");
        int rent = Utils.readInt(-1);
        if (rent != -1){
            byId.setRent(rent);
        }

        System.out.print("状态("+byId.getState()+"):");
        String state = Utils.readString(3," ");
        if (!"".equals(state)){
            byId.setState(state);
        }
        System.out.println("修改成功");
    }

    //根据ID查找房屋信息
    public void findHouse(){
        System.out.println("===========查找房屋============");
        System.out.println("输入查找的ID");
        int findId = Utils.readInt();
        House byId = houseService.findById(findId);
        if (byId != null){
            System.out.println(byId);
        }else {
            System.out.println("查找ID不存在");
        }
    }


    //删除房屋
    public void delHouse() {
        System.out.println("===========删除房屋============");
        System.out.print("请输入待删除房屋编号(-1退出)");
        int delId = Utils.readInt();
        if (delId == -1){
            return;
        }
        char choice = Utils.readConfirmSelection();
        if (choice == 'Y'){
            if (houseService.del(delId)){
                System.out.println("删除成功");
            }else {
                System.out.println("编号不存在");
            }
        }else {
            System.out.println("放弃删除房屋");
        }
    }


    //添加房屋
    public void addHouse(){
        System.out.println("===========添加房屋============");
        System.out.print("房主: ");
        String name = Utils.readString(8);
        System.out.print("电话: ");
        String phone = Utils.readString(12);
        System.out.print("地址: ");
        String address = Utils.readString(20);
        System.out.print("月租: ");
        int rent = Utils.readInt(10);
        System.out.print("状态: ");
        String state = Utils.readString(3);
        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newHouse)){
            System.out.println("===============添加成功================");
        }else {
            System.out.println("===========添加失败，房屋已满==========");
        }
    }

    //显示房屋列表
    public void listHouses(){
        System.out.println("===========房屋列表============");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（已出租/未出租）");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("===========房屋列表显示完毕============");
    }

    public void exit(){
        while (true) {
            System.out.println("确定是否退出(Y/N),必须输入Y/N否则循环提示");
            String key = Utils.readString(1);
            if (key.equals("y")|| key.equals("Y")){
                loop = false;
                break;
            } else if (key.equals("n")||key.equals("N")) {
                return;
            }
        }
    }


    //主菜单
    public void mainMenu(){
        do {
            System.out.println("===========房屋出租系统=============");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退       出");
            System.out.print("请输入你的选择(1-6):");
            key = Utils.readChar();
            switch (key) {
                case '1' : {
                    addHouse();
                    break;
                }
                case '2' : {
                    findHouse();
                    break;
                }
                case '3' : {
                    delHouse();
                    break;
                }
                case '4' : {
                    update();
                    break;
                }
                case '5' : {
                    listHouses();
                    break;
                }
                case '6' : {
                    exit();
                }
            }




        }while (loop);

    }

}
