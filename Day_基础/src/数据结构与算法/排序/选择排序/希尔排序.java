package 数据结构与算法.排序.选择排序;

import java.util.Random;

public class 希尔排序 {


    static  void xier(int[] arr){
        long before = System.currentTimeMillis();
        for (int h = arr.length; h >0 ; h=(h-1)/3) {
            for (int i = h; i <arr.length ; i++) {
                for (int j = i; j >h-1 ; j-=h) {
                        if(arr[j] < arr[j-h]){
                            int temp=arr[j];
                            arr[j]=arr[j-h];
                            arr[j-h]=temp;
                        }
                }
            }
        }
        long after = System.currentTimeMillis();
        System.out.println(after-before);

    }

    static  void xier2(int[] arr) {
        long before2 = System.currentTimeMillis();
        for (int h = arr.length; h > 0; h = h/2) {
            for (int i = h; i < arr.length; i++) {
                for (int j = i; j > h - 1; j -= h) {
                    if (arr[j] < arr[j - h]) {
                        int temp = arr[j];
                        arr[j] = arr[j - h];
                        arr[j - h] = temp;
                    }
                }
            }
        }
        long after2 = System.currentTimeMillis();
        System.out.println(after2 - before2);

    }

    static int[] getArray(){
        Random r=new Random();
        int[] arr=new int[10000];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(10000);
        }
        return arr;
    }

    public static void main(String[] args) {
//        int[] arr = getArray();
//        int[] arr2=getArray();
//        xier(arr);
//        xier2(arr2);

        int[] arr={5,4,7,5,2};
        xier2(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
