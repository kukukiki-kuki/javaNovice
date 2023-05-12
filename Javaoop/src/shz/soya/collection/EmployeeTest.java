package shz.soya.collection;

import shz.soya.oopPlus.MyDate;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description employeeTest
 * @date 2023/5/12 15:42:10
 */
public class EmployeeTest {
    public static void main(String[] args) {
        TreeSet<Employee> employees = new TreeSet<>();
        Employee employee0 = new Employee("b", 12, new MyDate(1999, 7, 9));
        Employee employee1 = new Employee("a", 13, new MyDate(1999, 7, 19));
        Employee employee2 = new Employee("f", 13, new MyDate(1998, 12, 21));
        Employee employee3 = new Employee("C", 15, new MyDate(2002, 4, 21));
        Employee employee4 = new Employee("E", 13, new MyDate(2001, 9, 12));

        employees.add(employee0);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
