package shz.soya.file;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description Fileweiter flush
 * @date 2023/5/17 15:37:29
 */
public class FWWriterFlush {
    @Test
    public void test() throws  IOException {
        // 使用文件名称创建流对象
        FileWriter fw = new FileWriter("fw.txt");
        // 写出数据，通过flush
        fw.write('刷'); // 写出第1个字符
        fw.flush();
        fw.write('新'); // 继续写出第2个字符，写出成功
        fw.flush();

        // 写出数据，通过close
        fw.write('关'); // 写出第1个字符
       // fw.close();
        fw.write('闭'); // 继续写出第2个字符,【报错】java.io.IOException: Stream closed
        fw.close();
    }
}
