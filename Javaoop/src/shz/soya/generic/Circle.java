package shz.soya.generic;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description circel dao
 * @date 2023/5/12 21:57:01
 */
public class Circle{
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

}
