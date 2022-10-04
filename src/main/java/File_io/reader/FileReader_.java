package File_io.reader;


import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) throws IOException {
        FileReader fileReader;
        String filePath = "src/main/java/File_io/file/file01";
        fileReader = new FileReader(filePath);
        int len;
        char[] buf = new char[8];
        while (( len = fileReader.read(buf)) != -1){
            System.out.println(new String(buf,0,len));
        }
        fileReader.close();
    }
}
