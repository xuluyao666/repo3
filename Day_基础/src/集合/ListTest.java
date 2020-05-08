package 集合;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ListTest {
    public static void main(String[] args) {
        int[] arr = {1,4,1,4,2,5,4,5,8,7,8,77,88,5,4,9,6,2,4,1,5};

        int[] brr=new int[100];

        for (int i=0;i<arr.length;i++){
            brr[arr[i]]++;
        }

        for (int i = 0; i < brr.length; i++) {
            if(brr[i]!=0) {
                System.out.println("字符：" + i + "出现" + brr[i] +"次");
            }
        }
    }
}
