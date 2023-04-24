package shz.soya.encapsulation;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("小猪");
        animal.setLeg(4);

    }

}
class Animal{
        private String name;
        private int leg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", leg=" + leg +
                '}';
    }
}
