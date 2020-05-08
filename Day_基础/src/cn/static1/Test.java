package cn.static1;

public class Test {
    public int test1(){
        int b=20;
        try{
            System.out.println("try block");
            b=b/0;
            return b+=80;
        }catch (Exception e){
            System.out.println("catch block");
             b+=50;
        } finally {
            System.out.println("finally block");

            if(b>25){
                System.out.println("b>25,b="+b);
            }
            b+=50;

        }
        return b;

    }


}
