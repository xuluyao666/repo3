package 数据结构与算法.线程.生产者消费者;

public class Clerk {

    private int count=0;


    public synchronized void pro() {
        if(count<20){

            count++;
            System.out.println(Thread.currentThread().getName()+"开始生产第："+count+"个产品");

            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void cus() {
        if(count>0){
            System.out.println(Thread.currentThread().getName()+"开始消费第："+count+"个产品");
            count--;

            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
