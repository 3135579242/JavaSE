package File_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class File_ {
    public static void main(String[] args) {

        create01();
    }

    public static void create01(){

        String filePath = "src/main/java/File_io/file/file01";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
