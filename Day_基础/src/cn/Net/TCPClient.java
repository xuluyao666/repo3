package cn.Net;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        //创建一个客户端对象Socket，构造方法绑定服务器的端口号好ip地址
        Socket socket=new Socket("127.0.0.1",8888);
        //创建本地字节输入流，获取本地文件
        FileInputStream fis=new FileInputStream("D:\\file\\in.txt");
        //使用Socket对象获取网络字节输出流对象
        OutputStream os = socket.getOutputStream();
        byte[] bytes=new byte[1024];
        int len=0;
        while ((len=fis.read(bytes))!=-1){
            //使用网络字节输出流的write方法给服务器发送数据,上传到服务器
            os.write(bytes,0,len);
        }
        //结束上传
        socket.shutdownOutput();
        //使用Socekt对象获取网络字节输入流对象
        InputStream is = socket.getInputStream();
        //回写服务器数据
        while((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        //关闭
        fis.close();
        socket.close();
    }
}
