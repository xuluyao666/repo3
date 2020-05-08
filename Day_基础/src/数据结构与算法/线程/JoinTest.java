package 数据结构与算法.线程;

public class JoinTest extends Thread {


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"//:"+i);

        }
    }


    public static void main(String[] args) {
        JoinTest j1=new JoinTest();
        j1.setName("线程1");

        JoinTest j2=new JoinTest();
        j2.setName("线程2");

        j1.start();
        try {
            j1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        j2.start();

    }
}
