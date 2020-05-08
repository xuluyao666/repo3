package cn.Thread;
public class Runnable01 implements Runnable {
    int b = 100;
    public   void m1() throws  Exception{
        b=1000;
        Thread.sleep(5000);
        System.out.println("b=" +b);
    }
    public void m2(){
        System.out.println(b);
    }
    @Override
    public void run() {
        try{
            m1();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception {
        Runnable01 run=new Runnable01();
        Thread t=new Thread(run);
        t.start();
        Thread.sleep(1000);
        run.m2();
    }
}
