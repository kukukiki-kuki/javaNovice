package shz.soya.packing;

import static java.lang.Integer.parseInt;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description 基本数据类型，包装类和字符拆串之间的转换
 * @date 2023/4/26 11:54:52
 */
public class packingTest {
    public static void main(String[] args) {
      //Integer obj1 = new Integer(4);//使用构造函数函数
     // Float f = new Float("4.56");
        // Long l = new Long("asdf");  //NumberFormatException

        Integer obj2 = Integer.valueOf(4);//使用包装类中的valueOf方法
        String s = String.valueOf(obj2);
        int i = parseInt(s);
    }

}
