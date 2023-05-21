package shz.soya.interAddress;

import java.io.*;
import java.net.Socket;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description massage handle test
 * @date 2023/5/18 18:14:52
 */
public class MessageHandleTest extends Thread{
    private Socket socket;
    private String ip;

    public MessageHandleTest(Socket socket){
        super();
        this.socket = socket;
    }

    public void run(){
        ip = socket.getInetAddress().getHostAddress();

        //1.向其他客户端发送上线消息
        try {
            sendToOther(ip+"上线了");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //2.接受该客户端发送的消息
        try {
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String str;
            while ((str=br.readLine())!=null){
                sendToOther(ip+":"+str);
            }
            sendToOther(ip+"下线了");
        } catch (IOException e) {
            try {
                sendToOther(ip+"掉线了");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }finally {
            TestChatServer.onlineList.remove(socket);
        }
    }

    //发送给其他人消息的方法
    public void sendToOther(String message) throws IOException {
        for (Socket on:TestChatServer.onlineList) {
            OutputStream os = on.getOutputStream();
            PrintStream printStream = new PrintStream(os);
            printStream.println(message);
        }
    }

}
