package shz.soya.exception;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description Finally
 * @date 2023/4/26 16:31:47
 */
public class FinalTest {
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
            return 0;
        }
    }
}
