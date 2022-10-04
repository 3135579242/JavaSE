package Array;

import medhod.Extends.Computer;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortCustom {
    public static void main(String[] args) {

        int[] arr ={1,-1,8,0,20};
//        Sort(arr);
        Sort2(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer)o1;
                int i2 = (Integer)o2;
                return i1 - i2;
            }
        });

        System.out.println(Arrays.toString(arr));

    }

    public static void Sort(int[] arr){
        int temp = 0;
        for (int i = 0;i < arr.length -1 ; i++){
            for (int j = 0; j < arr.length -1; j++) {
                if (arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] =temp;
                }
            }
        }
    }

    public static void Sort2(int[] arr, Comparator c){
        int temp = 0;
        for (int i = 0;i < arr.length -1 ; i++){
            for (int j = 0; j < arr.length -1; j++) {
                if (c.compare(arr[j],arr[j+1]) > 0 ){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] =temp;
                }
            }
        }
    }
}
