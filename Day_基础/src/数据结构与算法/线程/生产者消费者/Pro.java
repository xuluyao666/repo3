package 数据结构与算法.线程.生产者消费者;

public class Pro extends Thread {
    private Clerk clerk;

    public Pro(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始生产....");
        while (true){
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.pro();
        }




    }
}
