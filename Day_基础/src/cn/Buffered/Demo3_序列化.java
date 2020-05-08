package cn.Buffered;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo3_序列化 {

    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\file\\e.txt"));
        Person p=new Person("zhangsan",15);
        oos.writeObject(p);
        oos.close();
    }
}
