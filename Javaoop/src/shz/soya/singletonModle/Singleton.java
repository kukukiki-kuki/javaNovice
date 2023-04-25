package shz.soya.singletonModle;

//饿汉式
public class Singleton {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
    }
    // 1.私有化构造器
    private Singleton() {
    }

    // 2.内部提供一个当前类的实例
    // 4.此实例也必须静态化
    private static Singleton single = new Singleton();

    // 3.提供公共的静态的方法，返回当前类的对象
    public static Singleton getInstance() {
        return single;
    }
}
//懒汉式
//线程不安全
class Singleton1{
    // 1.私有化构造器
    private Singleton1() {
    }
    // 2.内部提供一个当前类的实例
    // 4.此实例也必须静态化
    private static Singleton1 single;
    // 3.提供公共的静态的方法，返回当前类的对象
    public static Singleton1 getInstance() {
        if(single == null) {
            single = new Singleton1();
        }
        return single;
    }
}