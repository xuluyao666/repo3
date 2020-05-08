package 数据结构与算法.线程;

public class Test {
    static final   Object o=new Object();
    public static void main(String[] args) throws InterruptedException {

             new Thread() {

                @Override
                public void run() {
                    synchronized (o) {
                    for (int i = 0; i < 5; i++) {
                        System.out.println(i);
                        try {
                            o.notify();
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                    o.notify();
                    }
                }
            }.start();




            new Thread() {
                @Override
                public void run() {
                    synchronized (o) {
                    for (int i = 5; i < 10; i++) {
                        System.out.println(i);
                        try {
                            o.notify();
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                    o.notify();
                    }
                }
            }.start();




    }
}
