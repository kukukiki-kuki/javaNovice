package shz.soya.collection;

import org.junit.Test;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description contain some radom numbers
 * @date 2023/5/12 11:29:06
 */
public class RandomValueTest {


    public static void main(String[] args) {
        RandomValueTest randomValueTest = new RandomValueTest();
        randomValueTest.scannerTest();
    }
    @Test
    public void test1(){
        HashSet set=   new HashSet();
        Random random = new Random();
        while (set.size()<10){
            int num = random.nextInt(20)+1;
            set.add(num);
        }
        for (Object i:set
        ) {
            System.out.println(i);
        }
    }
    public void scannerTest(){
        Scanner scanner = new Scanner(System.in);
        String next = scanner.nextLine();
        HashSet os = new HashSet();
        char[] charArray = next.toCharArray();
        for (char c :charArray) {
                os.add(c);
        }
        for (Object c:os) {
            System.out.println(c);
        }
    }
    @Test
    public void test02(){
        HashSet set = new HashSet();
        Student p1 = new Student(1001,"AA");
        Student p2 = new Student(1002,"BB");

        set.add(p1);
        set.add(p2);
        p1.setName("CC");
        set.remove(p1);
        System.out.println(set);

        set.add(new Student(1001,"CC"));
        System.out.println(set);

        set.add(new Student(1001,"AA"));
        System.out.println(set);
    }
}
