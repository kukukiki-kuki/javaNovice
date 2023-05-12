package shz.soya.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description treeSet test
 * @date 2023/5/12 13:00:14
 */
public class TreeSetTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("ccc");
        list.add("ccc");
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ddd");
        list.add("ddd");
        sort(list);
        System.out.println(list);
    }

    /*
     * 对集合中的元素排序,并保留重复
     */
    public static void sort(List list) {
        TreeSet ts = new TreeSet((o1, o2) -> { //
            // 重写compare方法
            String s1 = (String)o1;
            String s2 = (String)o2;
            int num = s1.compareTo(s2); // 比较内容
            return num == 0 ? 1 : num; // 如果内容一样返回一个不为0的数字即可
        });
        ts.addAll(list); // 将list集合中的所有元素添加到ts中
        list.clear(); //清空list
        list.addAll(ts); //将ts中排序并保留重复的结果在添加到list中
    }
}
