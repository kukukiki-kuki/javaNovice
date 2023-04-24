package shz.soya.oopPlus;

 class Creature {
    public Creature() {
        System.out.println("Creature无参数的构造器");
    }
}
class Animal extends Creature {

    public Animal(String name, int age) {
        this(name);
        System.out.println("Animal带两个参数的构造器，其age为" + age);
    }

    public Animal(String name) {
        System.out.println("Animal带一个参数的构造器，该动物的name为" + name);
    }

}
public class Dog extends Animal {
    public Dog() {
        super("汪汪队阿奇", 3);
        System.out.println("Dog无参数的构造器");
    }
    public static void main(String[] args) {
        new Dog();
    }
}
