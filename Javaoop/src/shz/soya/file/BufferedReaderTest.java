package shz.soya.file;

import org.junit.Test;

import java.io.*;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description buffer reader
 * @date 2023/5/17 21:05:39
 */
public class BufferedReaderTest {

    @Test
    public void testReadLine()throws IOException {
        // 创建流对象
        BufferedReader br = new BufferedReader(new FileReader("in.txt"));
        // 定义字符串,保存读取的一行文字
        String line;
        // 循环读取,读取到最后返回null
        while ((line = br.readLine())!=null) {
            System.out.println(line);
        }
        // 释放资源
        br.close();
    }

    @Test
    public void testNewLine()throws IOException{
        // 创建流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
        // 写出数据
        bw.write("李");
        // 写出换行
        bw.newLine();
        bw.write("守");
        bw.newLine();
        bw.write("俨");
        bw.newLine();
        // 释放资源
        bw.close();
    }

}
