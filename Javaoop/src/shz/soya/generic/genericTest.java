package shz.soya.generic;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description generic test
 * @date 2023/5/12 21:25:39
 */
public class genericTest {
    public static void main(String[] args) {
        genericTest genericTest = new genericTest();
        genericTest.genericTest1();
    }
    public void genericTest1(){
        ArrayList<Integer> integers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <5 ; i++) {
            int i1 =random.nextInt(100);
            integers.add(i1);
        }
        for (Integer integer : integers) {
            System.out.print(integer+"\t");
        }
        System.out.println();
        integers.removeIf(integer -> integer%2==0
        );
        for (Integer integer : integers) {
            System.out.print(integer+"\t");
        }
    }
}
