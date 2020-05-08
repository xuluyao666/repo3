package cn.Buffered;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo2_BufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\file\\out.txt"));
        BufferedReader br=new BufferedReader(new FileReader("D:\\file\\in.txt"));
        HashMap<String,String> map=new HashMap<>();
        String line;
        while((line=br.readLine())!=null){
            String[] split = line.split("\\.");
            map.put(split[0],split[1]);
        }
        Set<String> keySet = map.keySet();

        for(String s:keySet){
            String value = map.get(s);

            bw.write(s+"."+value);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
