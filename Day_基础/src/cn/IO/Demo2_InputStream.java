package cn.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2_InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fos=new FileInputStream("D:\\file\\a.txt");
        int len=0;
        byte[] bytes=new byte[1024];
        while ((len=fos.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }

    }
}
