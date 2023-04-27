package shz.soya.threadTest;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description 测试线程练习
 * @date 2023/4/27 10:57:54
 */
public class ThreadExciseTest {
    public static void main(String[] args) {
        ThreadExcise threadExcise = new ThreadExcise();
        ThreadExcise1 threadExcise1 = new ThreadExcise1();
        Thread thread1 = new Thread(threadExcise1,"我是奇数");
        Thread thread = new Thread(threadExcise,"我是偶数");
        thread.start();
        thread1.start();
    }
}
