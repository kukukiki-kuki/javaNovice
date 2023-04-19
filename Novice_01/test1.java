
import java.util.Date;
import java.util.Scanner;

class  Test1{
    public static void main(String[] args) {
        Test1 test1 = new Test1();
       // test1.getScanner();System.out.println(test1.rondRandom());
       test1.primeNumber();
    }

    //从键盘里获得不同类型的数据
    public void getScanner(){
       Scanner scanner = new Scanner(System.in);
       String string = scanner.next();
       Integer age = scanner.nextInt();
       System.out.println(string+age);
       scanner.close();
    }

    //获得一个0-10之间的随机数
    public int rondRandom(){
        int a = (int) (Math.random()*10);
        return a;
    }

    //switch-case的一些小示例
    //score的类型只能是前面的数据类型
    private void studentScore(int score){

        switch (score+100){
            case 10:
                System.out.println("10分");
                break;
            case 20:
                System.out.println("20分");
                break;
            default:
                System.out.println("你是个啥");
        }
    }
    //提出一个年月日，求解出是星期几
    public void weekDay(){
        //首先判断是否是润年
        Date date = new Date();
    }
    //找到100以内所有的素数
    public void primeNumber(){
        for (int i=2;i<=100;i++){
            int number = 0;
          for (int j=2;j<i;j++){
              if (i%j==0){
                 number++;
              }
          }
          if (number==0){
              System.out.println(i);
          }
        }
    }

    //Arrays 工具类的使用
    public  void  primeArrays(){

    }


}