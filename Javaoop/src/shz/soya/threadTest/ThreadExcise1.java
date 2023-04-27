package shz.soya.threadTest;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description 线程训练2
 * @date 2023/4/27 10:55:34
 */
public class ThreadExcise1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <50; i++) {
            System.out.println(Thread.currentThread().getName()+"-"+(2*i+1));
        }
    }
}
