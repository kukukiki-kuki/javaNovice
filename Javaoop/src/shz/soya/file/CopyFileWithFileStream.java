package shz.soya.file;

import java.io.*;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description File Stream
 * @date 2023/5/17 16:06:49
 */
public class CopyFileWithFileStream {
    public static void main(String[] args) {
        copyFileWithBufferedStream("D:\\Data\\test\\bbb\\1.jpg","D:\\Data\\test\\bbb\\3.jpg");
    }

    //使用FileInputStream,使用FileOutputStream
    public static  void copyFileFileStream(String srcPath,String destPath){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1,构建文件
            fis = new FileInputStream(new File(srcPath));
            fos = new FileOutputStream(new File(destPath));
            //2，复制操作
            byte[] buffs = new byte[100];
            int len;
            while ((len = fis.read(buffs))!=-1){
                fos.write(buffs,0,len);
            }
            System.out.println("复制成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            try {
                if (fis!=null){
                    fis.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (fos!=null){
                    fos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    //使用BuffferedInputStream 和BufferedOutputStream进行
    public static void copyFileWithBufferedStream(String srcPath,String destPath){
    FileInputStream fis = null;
    FileOutputStream fos = null;
    BufferedInputStream bis = null;
    BufferedOutputStream bos = null;
    //1.造文件
        File srcFile = new File(srcPath);
        File destFile = new File(destPath);
        try {
            fis =  new FileInputStream(srcFile);
            fos =  new FileOutputStream(destFile);

          bis =  new BufferedInputStream(fis);
          bos = new BufferedOutputStream(fos);

          //3.读写
            int len;
            byte[] bytes = new byte[100];
            while ((len = bis.read(bytes))!= -1){
                bos.write(bytes,0,len);
            }
            System.out.println("复制成功！");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (bos!=null){
                try {
                    bos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }if (bis!=null){
                try {
                    bis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
