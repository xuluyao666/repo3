package cn.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1_outputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream(new File("D:\\file\\a.txt"));
        byte[] bytes={65,66,67};
        fos.write(bytes);
        byte[] by="你好".getBytes();
        fos.write(by);
        fos.close();
    }
}
