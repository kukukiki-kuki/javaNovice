package shz.soya.interAddress;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description client master
 * @date 2023/5/18 17:41:22
 */
public class ClientMaster {
    public static void main(String[] args) throws IOException {
        //1.建立套接字
        Socket socket = new Socket("127.0.0.1", 8888);
        //2.发送数据
        OutputStream outputStream = socket.getOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        //3.接受服务端数据
        InputStream input = socket.getInputStream();
        BufferedReader br;
        if(args!= null && args.length>0) {
            String encoding = args[0];
            br = new BufferedReader(new InputStreamReader(input,encoding));
        }else{
            br = new BufferedReader(new InputStreamReader(input));
        }
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("客户端输入内容:");
            String message = scanner.nextLine();
            if (message.equals("Stop")){
                socket.shutdownInput();
                break;
            }
            printStream.println(message);
            String s = br.readLine();
            System.out.println("服务端的反馈是:"+s);
        }
        //4.关闭套接字
        scanner.close();
        socket.close();
    }
}
