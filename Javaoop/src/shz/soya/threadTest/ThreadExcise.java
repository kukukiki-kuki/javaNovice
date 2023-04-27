package shz.soya.threadTest;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description 线程练习
 * @date 2023/4/27 10:44:01
 */
public class ThreadExcise implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <=50; i++) {
            System.out.println(Thread.currentThread().getName()+"-"+(2*i));
        }
    }
}
