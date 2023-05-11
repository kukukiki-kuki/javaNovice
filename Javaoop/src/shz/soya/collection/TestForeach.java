package shz.soya.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description describe the iterable used in foreach
 * @date 2023/5/11 18:02:58
 */
public class TestForeach {
    public static void main(String[] args) {

    }
    @Test
    public void test01(){
        Collection coll = new ArrayList();
        coll.add("小李广");
        coll.add("扫地僧");
        coll.add("石破天");
        //foreach循环其实就是使用Iterator迭代器来完成元素的遍历的。
        for (Object o : coll) {
            System.out.println(o);
        }
    }
    @Test
    public void test02(){
        int[] nums = {1,2,3,4,5};
        for (int num : nums) {
            System.out.println(num);
        }
        System.out.println("-----------------");
        String[] names = {"张三","李四","王五"};
        for (String name : names) {
            System.out.println(name);
        }
    }
   @Test
   public void test03(){
       String[] str = new String[5];
       for (String myStr : str) {
           myStr = "atguigu";
           System.out.println(myStr);
       }
       for (String s : str) {
           System.out.println(s);
       }
   }
}
