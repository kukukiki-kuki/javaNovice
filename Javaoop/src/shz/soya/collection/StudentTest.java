package shz.soya.collection;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description student test
 * @date 2023/5/11 18:30:59
 */
public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        while (true){
            System.out.print("选择（1、录入；0、退出）:");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            if (i==0){
                break;
            }
            System.out.print("姓名:");
            String name = scanner.next();
            System.out.print("年龄:");
            int age = scanner.nextInt();
            Student student = new Student();
            student.setAge(age);
            student.setName(name);
            students.add(student);
        }
        for (Student stu:students
             ) {
            System.out.println(stu);
        }
    }

}
class Student{
    private String name;
    private int age;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
