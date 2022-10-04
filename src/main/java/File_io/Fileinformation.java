package File_io;

import java.io.*;

public class Fileinformation {
    public static void main(String[] args) {



    }










    public static void info(){
        File file = new File("src/main/java/File_io/file/file01");
        System.out.println("文件名字 = " + file.getName());
        System.out.println("文件绝对路径 = " + file.getAbsolutePath());
        System.out.println("文件父级目录 = " + file.getParent());
        System.out.println("文件绝对路径 = " + file.getAbsolutePath());
        System.out.println("文件大小(字节,一个汉字3字节) = " + file.length());
        System.out.println("文件是否存在 = " + file.exists());
        System.out.println("是不是一个文件 = " + file.isFile());
        System.out.println("是不是一个目录 = " + file.isDirectory());


    }
}
