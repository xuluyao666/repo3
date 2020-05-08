package 数据结构与算法.线程.线程实现方式;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest implements Callable {
    @Override
    public Object call() throws Exception {
        int sum=0;
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            sum+=i;
        }

        return sum;
    }


    public static void main(String[] args) {
        //1.创建callable实现类对象
        CallableTest callableTest=new CallableTest();
        //2.将callable实现类对象传入FuturnTask构造器
        FutureTask futureTask=new FutureTask(callableTest);
        //3.将FuturnTask实现类对象传入Thread构造器
        new Thread(futureTask).start();



        try {
            //4.通过futureTask对象的get（）方法获取返回值对象
            Object o = futureTask.get();
            System.out.println(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
