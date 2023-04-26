package shz.soya.exception;

import org.junit.Test;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description 堆异常
 * @date 2023/4/26 16:15:10
 */
public class TestOutOfMemoryError {
    @Test
    public void test02(){
        //OutOfMemoryError
        //方式一：
        int[] arr = new int[Integer.MAX_VALUE];
    }
    @Test
    public void test03(){
        //OutOfMemoryError
        //方式二：
        StringBuilder s = new StringBuilder();
        while(true){
            s.append("atguigu");
        }
    }
}
