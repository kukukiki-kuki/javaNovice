package shz.soya.collection;

import org.jetbrains.annotations.NotNull;
import shz.soya.oopPlus.MyDate;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description employee
 * @date 2023/5/12 14:36:44
 */
public class Employee implements Comparable{
    private String name;
    private Integer age;
    private MyDate birthday;

    public Employee(String name, Integer age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public int compareTo(@NotNull Object o) {
        if(o == this){
            return 0;
        }
        if(o instanceof Employee emp){
            return this.name.compareTo(emp.name);
        }
        throw new RuntimeException("传入的类型不匹配");
    }

}
