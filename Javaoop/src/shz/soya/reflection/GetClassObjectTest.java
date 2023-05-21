package shz.soya.reflection;

import org.junit.Test;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description get class object
 * @date 2023/5/21 17:02:12
 */
public class GetClassObjectTest {

    public GetClassObjectTest(String name,int age){
    }
    public GetClassObjectTest(){
    }
    public static void main(String[] args) {

    }
    @Test
    public void test01() throws ClassNotFoundException{

        Class c1 = GetClassObjectTest.class;
        GetClassObjectTest obj = new GetClassObjectTest();
        Class c2 = obj.getClass();
        Class c3 = Class.forName("shz.soya.reflection.GetClassObjectTest");
        Class c4 = ClassLoader.getSystemClassLoader().loadClass("shz.soya.reflection.GetClassObjectTest");

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);

        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
        System.out.println(c1 == c4);
    }
}
