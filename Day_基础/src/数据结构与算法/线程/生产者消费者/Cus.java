package 数据结构与算法.线程.生产者消费者;

public class Cus extends Thread {
    private Clerk clerk;

    public Cus(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName()+"开始消费....");
        while (true){
            clerk.cus();
        }
        }
    }

