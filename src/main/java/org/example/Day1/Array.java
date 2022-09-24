package org.example.Day1;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[][] arr = new int[11][11];

        arr[1][2]=1;
        arr[2][3]=1;

        System.out.println("====");

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
        System.out.println("============");
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (arr[i][j]!=0){
                    sum++;
                }
            }
        }
        System.out.println(" "+ sum);

        int[][] arr2 = new int[sum+1][3];
        arr2[0][0] = 11;
        arr2[0][1] = 11;
        arr2[0][2] = sum;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]!=0){
                    count++;
                    arr2[count][0] = i;
                    arr2[count][1] = j;
                    arr2[count][2] = arr[i][j];
                }
            }
        }
        System.out.println("吸塑");
        for (int i = 0; i <arr2.length ; i++) {
            System.out.println(arr2[i][0]+"\t" + arr2[i][1]+"\t"+
                    arr2[i][2]+"\t");
        }
    }
}
