package shz.soya.file;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description picture secret test
 * @date 2023/5/17 15:48:22
 */
public class PictureSecretTest {
    public static void main(String[] args) {

    }
    /*
     * 图片的加密
     * */
    @Test
    public void test1(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File file1 = new File("pony.jpg");
            File file2 = new File("pony_secret.jpg");
            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);

            //方式1：每次读入一个字节，效率低
//            int data;
//            while((data = fis.read()) != -1){
//                fos.write(data ^ 5);
//            }
            //方式2：每次读入一个字节数组，效率高
            int len;
            byte[] buffer = new byte[1024];
            while((len = fis.read(buffer)) != -1){
                for(int i = 0;i < len;i++){
                    buffer[i] = (byte) (buffer[i] ^ 5);
                }
                fos.write(buffer,0,len);

            }


            System.out.println("加密成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * 图片的解密
     * */
    @Test
    public void test2(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File file1 = new File("pony_secret.jpg");
            File file2 = new File("pony_unsecret.jpg");
            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);

            //方式1：每次读入一个字节，效率低
//            int data;
//            while((data = fis.read()) != -1){
//                fos.write(data ^ 5);
//            }
            //方式2：每次读入一个字节数组，效率高
            int len;
            byte[] buffer = new byte[1024];
            while((len = fis.read(buffer)) != -1){

                for(int i = 0;i < len;i++){
                    buffer[i] = (byte) (buffer[i] ^ 5);
                }

                fos.write(buffer,0,len);

            }

            System.out.println("解密成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
