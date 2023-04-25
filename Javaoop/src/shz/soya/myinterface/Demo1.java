package shz.soya.myinterface;

public interface Demo1 {
    //静态变量
    long MAX_SPEED = 1000*500;
    //抽象方法
    void Test();

    //默认方法
    default void Test1(){
        System.out.println("你好");
    }
    //静态方法
    static void show(){
        System.out.println("show......");
    }
}
