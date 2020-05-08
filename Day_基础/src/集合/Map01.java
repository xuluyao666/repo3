package 集合;


import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class Map01 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        List<String> link=new LinkedList<String>();

        long t1=System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            list.add("s");
        }
        long t2=System.currentTimeMillis();

        long t3=System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            link.add("s");
        }
        long t4=System.currentTimeMillis();


        System.out.println(t2-t1);
        System.out.println(t4-t3);
//        ArrayList<String> array = new ArrayList();
//        LinkedList<String> link = new LinkedList();
//
//        //ArrayList增加元素所需时间
//        long start1 = System.currentTimeMillis();
//        for (int i = 0; i < 500000; i++) {
//            array.add("wuhan"+i);
//        }
//        long end1 = System.currentTimeMillis();
//
//        //LinkedList增加元素所需时间
//        long start2 = System.currentTimeMillis();
//        for (int i = 0; i < 500000; i++) {
//            link.add("wuhan"+i);
//        }
//        long end2 = System.currentTimeMillis();
//        System.out.println("ArrayList增加元素所需时间:"+(end1-start1));//54
//        System.out.println("LinkedList增加元素所需时间:"+(end2-start2));




    }


}
