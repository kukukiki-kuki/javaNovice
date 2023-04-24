package shz.soya.encapsulation;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employee = new Employee[2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <employee.length ; i++) {
            employee[i] = new Employee();
            System.out.println("--------输入员工列表--------");
            System.out.print("姓名：");
            String name = scanner.next();
            employee[i].setName(name);
            System.out.print("性别：");
            String gender = scanner.next();
            employee[i].setGender(gender);
            System.out.print("年龄：");
            int age = scanner.nextInt();
            employee[i].setAge(age);
            System.out.print("号码：");
            String phoneNumber = scanner.next();
            employee[i].setPhoneNumber(phoneNumber);


        }
        System.out.println("-----------员工列表-----------");
        System.out.println("姓名\t"+"性别\t"+"年龄\t"+"号码\t");
        for (int i = 0; i <employee.length ; i++) {
            Employee employee1 = employee[i];
            System.out.println(employee1.getName()+"\t"+employee1.getGender()+"\t"+employee1.getAge()+"\t"+employee1.getPhoneNumber());

        }
    }
}
class Employee{
    private int age;
    private String phoneNumber;
    private String gender;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
