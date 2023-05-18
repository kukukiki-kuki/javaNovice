package shz.soya.interAddress;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description test chat server
 * @date 2023/5/18 18:02:58
 */
public class TestChatServer {
   static ArrayList<Socket> onlineList = new ArrayList<Socket>();
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8989);
        System.out.println("等待连接中......");


        while (true){
            Socket accept = serverSocket.accept();
            onlineList.add(accept);
            MessageHandleTest messageHandleTest = new MessageHandleTest(accept);
            messageHandleTest.start();
        }
    }


}

