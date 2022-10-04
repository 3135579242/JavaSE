package File_io.OutputStream_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_ {
    public static void main(String[] args) throws IOException {
        writeFile();

    }

    public  static  void writeFile() throws IOException {
        FileOutputStream fileOutputStream = null;
        //获取路径
        String filePath = "src/main/java/File_io/file/file02";
        //得到对象          append 设置为true 则不会置换文件内容 追加进去
        fileOutputStream = new FileOutputStream(filePath,true);
        //写入一个字节
        //fileOutputStream.write('W');
        String value = "loulanalong";
        //写入多个字节 getBytes 可以把字符串变成字节数组 off从字符第几个开始写入, len 写入几个
        fileOutputStream.write(value.getBytes(),3,3);
        fileOutputStream.close();
    }
}
