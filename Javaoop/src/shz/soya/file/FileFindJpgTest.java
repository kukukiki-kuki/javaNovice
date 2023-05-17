package shz.soya.file;

import org.junit.Test;

import java.io.File;
import java.util.Objects;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description file test2
 * @date 2023/5/17 11:28:33
 */
public class FileFindJpgTest {
    public static void main(String[] args) {

    }
    @Test
    public void test1(){
        File file = new File("D:\\Data\\test\\bbb");
        for (String s : Objects.requireNonNull(file.list())) {
            if (s.endsWith(".jpg")){
                System.out.println(s);
            }
        }
    }
    @Test
    public void test2(){
        File file = new File("D:\\Data\\test\\bbb");
        for (File s : Objects.requireNonNull(file.listFiles())) {
            if (s.getName().endsWith(".jpg")){
                //System.out.println(s.getAbsolutePath());
                System.out.println(s.getName());
            }
        }
    }
}
