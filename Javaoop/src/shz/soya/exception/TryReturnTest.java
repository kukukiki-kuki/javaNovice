package shz.soya.exception;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description try return exception
 * @date 2023/4/26 16:34:13
 */
public class TryReturnTest {
    public static void main(String[] args) {
        int result = test("12");
        System.out.println(result);
    }

    public static int test(String str){
        try{
            Integer.parseInt(str);
            return 1;
        }catch(NumberFormatException e){
            return -1;
        }finally{
            System.out.println("test结束");
        }
    }
}
