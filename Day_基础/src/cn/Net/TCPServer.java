package cn.Net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream(new File("D:\\file2"+"\\in.txt"));
        ServerSocket server=new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        byte[] bytes=new byte[1024];
        int len=0;

        while((len=is.read(bytes))!=-1){
            fos.write(bytes,0,len);

        }
        OutputStream os = socket.getOutputStream();
        os.write("收到".getBytes());

        fos.close();
        socket.close();
        server.close();

    }
}
