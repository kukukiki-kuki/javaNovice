package shz.soya.exception;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description try return
 * @date 2023/4/26 16:32:46
 */
public class CatchReturnTest {
    public static void main(String[] args) {
        int result = test("a");
        System.out.println(result);
    }

    public static int test(String str) {
        try {
            Integer.parseInt(str);
            return 1;
        } catch (NumberFormatException e) {
            return -1;
        } finally {
            System.out.println("test结束");
        }
    }
}
