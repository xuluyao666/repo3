package cn.File;

public class Demo01_递归 {
    public static void main(String[] args) {
        int s = s(5);
        System.out.println(s);
    }

    public static int s(int n){

        if(n==1){
            return 1;
        }

        return n*s(n-1);
    }

}
