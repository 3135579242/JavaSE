package File_io.FileInputStream_;

import File_io.Dog;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectInputStream_ {
    public static void main(String[] args) throws Exception {
        String filePath = "src/main/java/File_io/file/data.dat";

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        Object dog = ois.readObject();
        System.out.println("o 运行类型= " + dog.getClass());
        System.out.println("狗信息"+dog);

        Dog dog1 = (Dog) dog;


        ois.close();

    }
}