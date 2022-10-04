package File_io.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties_ {
    public static void main(String[] args) throws IOException {

        //第一步
        Properties properties = new Properties();
        //第二
        properties.load(new FileReader("src/main/java/File_io/properties/mysql.properties"));
        System.out.println(properties.getProperty("pwd"));

    }
}
