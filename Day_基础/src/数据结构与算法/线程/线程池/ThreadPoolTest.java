package 数据结构与算法.线程.线程池;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * 创建线程池的四种方式
 */
public class ThreadPoolTest {

    public static void main(String[] args) {
        //1.创建固定大小的线程池，核心线程数量和最大一样
        Executor pool = Executors.newFixedThreadPool(5);
        Executors.newSingleThreadExecutor();
        Executors.newScheduledThreadPool(10);
        Executors.newCachedThreadPool();

    }
}
