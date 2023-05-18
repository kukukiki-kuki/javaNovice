package shz.soya.interAddress;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description inet4 address
 * @date 2023/5/18 16:32:21
 */
public class TestInetAddress {

    @Test
    public void test01() throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
    }
    @Test
    public void test02()throws UnknownHostException{
        InetAddress atguigu = InetAddress.getByName("www.atguigu.com");
        System.out.println(atguigu);
    }
    @Test
    public void test03()throws UnknownHostException{
    //byte[] addr = {112,54,108,98};
        byte[] addr = {(byte) 192, (byte) 168,24,56};
        InetAddress atguigu = InetAddress.getByAddress(addr);
        System.out.println(atguigu);
    }
}
