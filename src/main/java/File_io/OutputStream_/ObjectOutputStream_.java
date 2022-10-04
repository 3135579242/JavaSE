package File_io.OutputStream_;

import File_io.Dog;

import java.io.*;

public class ObjectOutputStream_ {
    public static void main(String[] args) throws IOException {
        //序列化后，保存的文本格式，不是纯文本
        String filePath = "src/main/java/File_io/file/data.dat";

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
        objectOutputStream.writeInt(100);
        objectOutputStream.writeBoolean(true);
        objectOutputStream.writeChar('a');
        objectOutputStream.writeDouble(9.9);
        objectOutputStream.writeUTF("阿龙楼兰");

        objectOutputStream.writeObject(new Dog("小黑",3));

        objectOutputStream.close();


        System.out.println("数据保存完毕序列化");
    }
}