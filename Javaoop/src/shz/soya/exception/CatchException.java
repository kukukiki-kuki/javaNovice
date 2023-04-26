package shz.soya.exception;

import org.junit.Test;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description 异常捕获
 * @date 2023/4/26 16:17:56
 */
public class CatchException {
    public static void main(String[] args) {
        CatchException catchException = new CatchException();

    }
    @Test
    public void indexOutExp(){
        String friends[] = { "lisa", "bily", "kessy" };
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(friends[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index err");
        }
        System.out.println("\nthis is the end");
    }
    @Test
    public void divideZero(){
        int x = 0;
        int y = 10;
        try {
             y = 3 / x;
        } catch (ArithmeticException e) {
            System.out.println("divide by zero error!"+y);
        }
        System.out.println("program ends ok!");
    }
    @Test
    public void test1(){
        try{
            String str1 = "atguigu.com";
            str1 = null;
            System.out.println(str1.charAt(0));
        }catch(NullPointerException e){
            //异常的处理方式1
            System.out.println("不好意思，亲~出现了小问题，正在加紧解决...");
        }catch(ClassCastException e){
            //异常的处理方式2
            System.out.println("出现了类型转换的异常");
        }catch(RuntimeException e){
            //异常的处理方式3
            System.out.println("出现了运行时异常");
        }finally {
            System.out.println("一定要关闭资源，否则后果不堪设想！");

        }
        //此处的代码，在异常被处理了以后，是可以正常执行的
        System.out.println("hello");
    }
    }


