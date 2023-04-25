package shz.soya.innerClass;

public class TestLocalInner {
    public static void main(String[] args) {
        OuterTest.outMethod();
        System.out.println("-------------------");

        OuterTest out = new OuterTest();
        out.outTest();
        System.out.println("-------------------");

        Runner runner = OuterTest.getRunner();
        runner.run();

    }
}
class OuterTest{

    public static void outMethod(){
        System.out.println("OuterTest.outMethod");
        final String c = "局部变量c";
        class Inner{
            public void inMethod(){
                System.out.println("Inner.inMethod");
                System.out.println(c);
            }
        }

        Inner in = new Inner();
        in.inMethod();
    }

    public void outTest(){
        class Inner{
            public void inMethod1(){
                System.out.println("Inner.inMethod1");
            }
        }

        Inner in = new Inner();
        in.inMethod1();
    }

    public static Runner getRunner(){
        class LocalRunner implements Runner{
            @Override
            public void run() {
                System.out.println("LocalRunner.run");
            }
        }
        return new LocalRunner();
    }

}
interface Runner{
    void run();
}