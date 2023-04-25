package shz.soya.oopPlusPlus;

public abstract class Employee {
    private String name;
    private int age;

    public Employee(String name,int age){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract void  work();
    public abstract double callMoney(int days);

}
