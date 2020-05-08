package cn.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo3_FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("D:\\file\\a.txt");
        int len=0;
        char[] chars=new char[1024];
        while((len=fr.read(chars))!=-1){
            System.out.println(new String(chars,0,4));
        }
    }
}
