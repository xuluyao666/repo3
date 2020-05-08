package 数据结构与算法.线程.生产者消费者;

public class ProduceTest {



    public static void main(String[] args) {
        Clerk clerk=new Clerk();
        Pro pro=new Pro(clerk);
        Pro pro2=new Pro(clerk);
        Cus cus=new Cus(clerk);

        pro.setName("生产者1");
        pro2.setName("生产者2");
        cus.setName("消费者1");


        pro.start();
        pro2.start();
        cus.start();
    }
}
