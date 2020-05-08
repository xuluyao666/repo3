package cn.Buffered;


import java.io.*;

public class Demo1_BufferedInputStream {
    public static void main(String[] args) throws IOException {
        long time1 = System.currentTimeMillis();
          BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\file\\f.txt"));
          BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\file2\\f.txt"));
//
        int len=0;
        byte[] bytes=new byte[1024];
        while((len=bis.read(bytes))!=-1){
           bos.write(bytes,0,len);
        }
        bis.close();
        bos.close();
        long time2=System.currentTimeMillis();
        System.out.println("用时："+(time2-time1));

    }
}
