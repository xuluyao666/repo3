package cn.IO;

import java.io.*;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class Demo5_Pro {
    public static void main(String[] args) throws IOException {
        Properties pro=new Properties();
        pro.load(new FileInputStream("D:\\file\\f.txt"));
        Set<String> strings = pro.stringPropertyNames();
        for(String key : strings){
            System.out.println(key+"="+pro.getProperty(key));
        }


    }
}
