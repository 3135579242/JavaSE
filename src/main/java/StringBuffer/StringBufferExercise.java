package StringBuffer;

import java.util.Scanner;

public class StringBufferExercise {
    public static void main(String[] args) {
        String input = "1112322222456.12";
        StringBuffer sb = new StringBuffer(input);
        for (int i = sb.lastIndexOf(".") - 3; i > 0 ; i-=3) {
            sb = sb.insert(i,",");
        }
        System.out.println(sb);
    }
}
