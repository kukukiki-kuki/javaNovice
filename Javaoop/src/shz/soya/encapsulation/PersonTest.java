package shz.soya.encapsulation;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(200);
        System.out.println(person.getAge());
    }
}
class Person{
    private int age;

    public void setAge(int age){
        if (age>=0 && age<130){
            this.age = age;
        }else {
            System.out.println("你不是人");
        }
    }
    public int getAge(){

        return age;
    }
}
