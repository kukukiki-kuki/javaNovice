package shz.soya.generic;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description circleComparator
 * @date 2023/5/12 21:56:05
 */
public class CircleComparator1 implements Comparator<Circle> {



    @Override
    public int compare(Circle o1, Circle o2) {
        return Double.compare(o1.getRadius(),o2.getRadius());
    }
}
