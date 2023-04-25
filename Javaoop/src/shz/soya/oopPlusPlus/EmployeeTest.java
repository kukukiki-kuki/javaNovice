package shz.soya.oopPlusPlus;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Manager("李华",35);
        employees[1] = new Developer("张三",30);
        employees[2] = new Developer("王五",26);
        int sum = 0;
        for (int i = 0; i < employees.length ; i++) {
           sum += employees[i].callMoney(90);
        }
        System.out.println(sum);
    }
}
