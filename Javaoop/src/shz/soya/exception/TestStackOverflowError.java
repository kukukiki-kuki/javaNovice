package shz.soya.exception;
import org.junit.Test;
/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description 栈溢出异常
 * @date 2023/4/26 16:13:50
 */


public class TestStackOverflowError {
    @Test
    public void test01(){
        //StackOverflowError
        recursion();
    }

    public void recursion(){ //递归方法
        recursion();
    }
}
