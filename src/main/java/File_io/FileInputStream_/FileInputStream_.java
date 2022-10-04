package File_io.FileInputStream_;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputStream_ {
    public static void main(String[] args) throws IOException {
        readFile();



    }

    public static void readFile() throws IOException {
        int readData = 0;
        byte[] bytes = new byte[16];
        //第一步获取路径
        String filePath = "src/main/java/File_io/file/file01";
        //创建FileInputStream对象获取文件
        FileInputStream fileInputStream = new FileInputStream(filePath);
        while (( readData = fileInputStream.read(bytes)) != -1 ){
            System.out.println(new String(bytes,0,readData));
        }
        fileInputStream.close();
    }
}
