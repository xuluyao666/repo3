package cn.Buffered;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo4_反序列化 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\file\\e.txt"));
        Object o = ois.readObject();
        System.out.println(o);
    }
}
