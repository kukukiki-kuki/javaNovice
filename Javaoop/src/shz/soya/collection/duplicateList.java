package shz.soya.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description remove the duplicate number in the list
 * @date 2023/5/12 11:24:24
 */
public class duplicateList {
    public static List duplicateList(List list) {
        HashSet set = new HashSet();
        set.addAll(list);
        return new ArrayList(set);
    }
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(4);
        List list2 = duplicateList(list);
        for (Object integer : list2) {
            System.out.println(integer);
        }
    }

}
