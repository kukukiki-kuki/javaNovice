package shz.soya.file;

import java.io.*;
import java.util.Random;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description name construct
 * @date 2023/5/17 21:40:48
 */
public class NameConstructTest {
    public static void main(String[] args) throws IOException {
        nameTest1();
    }
    public static void nameTest1() throws IOException {
        String [] firstName = {"赵","钱","孙","李","王","吴","曾","周","郑","冯","陈","楚","韦","何","吕","施","张"};
        String [] lastName = {"一","二","三","四","五","六"};
        Random random = new Random();
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Data\\test\\bbb\\name.txt"));
        for (int i = 0; i <1000 ; i++) {
            int i1 = random.nextInt(16);
            int i2 = random.nextInt(5);
            String first = firstName[i1];
            String last = lastName[i2];
            try {
                bw.write(first);
                bw.write(" ");
                bw.write(last);
                bw.newLine();
                bw.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
