package shz.soya.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description file exercise test1
 * @date 2023/5/16 23:14:38
 */
public class FileTest1 {
    public static void main(String[] args) {
        FileTest1 fileTest1 = new FileTest1();
        fileTest1.strTest("D:\\Data\\test\\bbb\\ddd.txt");
    }
    public void strTest(String str){
        File file = new File(str);
        System.out.println(file.delete());
    }

    @Test
    public void test1() throws IOException {
        File file0 = new File("D:\\Data\\test\\bbb\\lsy.txt");
        System.out.println(file0.createNewFile());
        File file1 = new File("D:\\Data\\test\\bbb\\ccc.txt");
        boolean newFile = file1.createNewFile();
        File file2 = new File("D:\\Data\\test\\bbb\\ddd.txt");
        System.out.println(file2.createNewFile());
        File dir0 = new File("D:\\Data\\test\\bbb\\aaa");
        System.out.println(dir0.mkdir());
        File dir1 = new File("D:\\Data\\test\\bbb\\bbb");
        System.out.println(dir1.mkdir());
        File dir2 = new File("D:\\Data\\test\\bbb\\bbb\\aaa");
        System.out.println(dir2.mkdir());
    }

}
