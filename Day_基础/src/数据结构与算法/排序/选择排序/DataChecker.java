package 数据结构与算法.排序.选择排序;

import java.util.Arrays;
import java.util.Random;

public class DataChecker {


    static int[] generateArray(){
        Random r = new Random();

        int[] arr = new int[10000];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(10000);
        }

        return arr;
    }


    static void check(){
        int[] arr = generateArray();
        int[] arr1 = new int[arr.length];
        System.arraycopy(arr,0,arr1,0,arr.length);

        Arrays.sort(arr);
//        选择排序.choose(arr1);
//        冒泡排序.maopao(arr1);
//        希尔排序.xier(arr1);
//        插入排序.charu(arr1);


        Boolean same=true;
        for (int i = 0; i < arr1.length; i++) {
            if(arr[i]!=arr1[i]){
                same=false;
            }


        }
        System.out.println(same==true?"right":"wrong");

    }


    public static void main(String[] args) {
        check();
    }
}
