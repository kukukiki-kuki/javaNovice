package shz.soya.interAddress;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description master server
 * @date 2023/5/18 17:29:00
 */
public class ServeMaster {
    public static void main(String[] args) throws IOException {
        //1.创建一个套接字

        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("等待连接.....");

        int count = 0;
        while (true){
            //2.接受客服端的请求和数据
            Socket accept = serverSocket.accept();
            System.out.println("第"+ ++count+"客户端"+accept.getInetAddress().getHostAddress()+"连接成功");
            ClientHandlerThread clientHandlerThread = new ClientHandlerThread(accept);
            clientHandlerThread.start();
        }
        //4.关闭套接字
    }

}
