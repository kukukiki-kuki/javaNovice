package shz.soya.file;

import org.junit.Test;

import java.io.File;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description file info method
 * @date 2023/5/16 22:54:55
 */
public class FileInfoMethod {
    public static void main(String[] args) {
        File f = new File("D:\\Data\\test\\bbb\\aaa.txt");
        System.out.println("文件构造路径:"+f.getPath());
        System.out.println("文件名称:"+f.getName());
        System.out.println("文件长度:"+f.length()+"字节");
        System.out.println("文件最后修改时间：" + LocalDateTime.ofInstant(Instant.ofEpochMilli(f.lastModified()), ZoneId.of("Asia/Shanghai")));

        File f2 = new File("d:/aaa");
        System.out.println("目录构造路径:"+f2.getPath());
        System.out.println("目录名称:"+f2.getName());
        System.out.println("目录长度:"+f2.length()+"字节");
        System.out.println("文件最后修改时间：" + LocalDateTime.ofInstant(Instant.ofEpochMilli(f.lastModified()),ZoneId.of("Asia/Shanghai")));
    }
    @Test
    public void test01() {
        File dir = new File("D:\\Data\\JavaData");
        String[] subs = dir.list();
        for (String sub : subs) {
            System.out.println(sub);
        }
    }
}
