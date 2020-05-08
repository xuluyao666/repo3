package cn.fanshe;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
       replace01("hello     world");
    }

    public static void  replace01(String str){
        while (str.contains("  ")){
            str = str.replace("  ", " ");
        }
        String s = str.replace(" ", "%20");
        System.out.println(s);
    }
}
