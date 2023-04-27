package shz.soya.threadTest;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description 线程优先级练习
 * @date 2023/4/27 11:16:30
 */
public class ThreadPriority {
    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run(){
                System.out.println(getName() + "的优先级：" + getPriority());
            }
        };
        t.setPriority(10);
        t.start();

        System.out.println(Thread.currentThread().getName() +"的优先级：" + Thread.currentThread().getPriority());
    }
}
