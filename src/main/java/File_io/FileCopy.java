package File_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        //文件所在位置
        String value = "C:\\Users\\LT\\Desktop\\JavaSE\\JavaSE\\al.jpg";
        //文件输出位置 名字可更改
        String filePath = "src/main/java/File_io/file/file01.jpg";
        fileInputStream = new FileInputStream(value);
        fileOutputStream = new FileOutputStream(filePath);
        byte[] bytes = new byte[1024];
        int len = 0;
        while (( len = fileInputStream.read(bytes) ) != -1 ){
            fileOutputStream.write(bytes,0,len);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
