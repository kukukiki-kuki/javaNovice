import java.util.Scanner;
class  Test1{
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.getScanner();
        System.out.println("hello world");
    }

    //从键盘里获得不同类型的数据
    public void getScanner(){
       Scanner scanner = new Scanner(System.in);
       String string = scanner.next();
       System.out.println(string);
    }

}