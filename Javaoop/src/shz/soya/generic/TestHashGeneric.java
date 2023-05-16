package shz.soya.generic;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description test generic
 * @date 2023/5/12 21:59:23
 */
public class TestHashGeneric {
    public static void main(String[] args) {
        CircleComparator1 circleComparator1 = new CircleComparator1();
        System.out.println(circleComparator1.compare(new Circle(1), new Circle(2)));
    }
}

