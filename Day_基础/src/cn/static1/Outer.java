package cn.static1;

public class Outer {

    String str="ss";
     public static class Inner{
         String str="a";
        public void method() {
            System.out.println(str);
        }
    }
}
