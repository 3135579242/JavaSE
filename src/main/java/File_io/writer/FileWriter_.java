package File_io.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter;
        String filePath = "src/main/java/File_io/file/file01";
        fileWriter = new FileWriter(filePath,true);
        fileWriter.write('o');
        fileWriter.close();



    }
}
