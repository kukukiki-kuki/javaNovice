package shz.soya.testClass;

import org.junit.Test;


import java.io.UnsupportedEncodingException;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description 常用类和基础API
 * @date 2023/5/8 17:00:03
 */
public class StringTest {
    String str = "good";
    char[] ch = { 't', 'e', 's', 't' };
    public static void main(String[] args) throws UnsupportedEncodingException {

       /* StringTest stringTest = new StringTest();
        stringTest.test02();
        stringTest.test01();
        stringTest.stringTest();
        StringTest ex = new StringTest();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");//
        System.out.println(ex.ch);*/
        StringTest stringTest = new StringTest();
        stringTest.calendarTest();


    }
    public void stringTest(){
        String s1 = "hello";
        String s2 = "world";
        String s3 = "hello" + "world";
        String s4 = s1 + "world";
        String s5 = s1 + s2;
        String s6 = (s1 + s2).intern();

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s4 == s5);
        System.out.println(s3 == s6);
    }

    /**
     *
     * @param str 字符串
     * @param ch 字符数组
     */
    public void change(String str, char[] ch) {
        str = "test ok";
        ch[0] = 'b';
    }
    @Test
    public void test01() throws UnsupportedEncodingException {
        String str = "中国";
        System.out.println(str.getBytes("GBK").length);
        System.out.println(str.getBytes("UTF-8").length);
        System.out.println(new String(str.getBytes("GBK"), "GBK"));
    }

    /**
     *String的常用方法
     */
    @Test
    public void test02(){
    //将用户输入的单词全部转为小写，如果用户没有输入单词，重新输入
        Scanner input = new Scanner(System.in);
        String word;
        while(true){
            System.out.print("请输入单词：");
            word = input.nextLine();
            if(word.trim().length()!=0){
                word = word.toLowerCase();
                break;
            }
        }
        System.out.println(word);
    }
    @Test
    public void DateTest(){
        Date date = new Date();

        System.out.println(date.getTime());
    }
    //格式化
    @Test
    public void test1(){
        Date d = new Date();

        SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 SSS毫秒  E Z");
        //把Date日期转成字符串，按照指定的格式转
        String str = sf.format(d);
        System.out.println(str);
    }
    //解析
    @Test
    public void test2() throws ParseException {
        String str = "2022年06月06日 16时03分14秒 545毫秒  星期四 +0800";
        SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 SSS毫秒  E Z");
        Date d = sf.parse(str);
        System.out.println(d);
    }
    @Test
    public void test3(){
        Calendar instance = Calendar.getInstance();
        int year = instance.get(Calendar.YEAR);
        int month = instance.get(Calendar.MONTH)+1;
        int day = instance.get(Calendar.DATE);
        int hour = instance.get(Calendar.HOUR_OF_DAY);
        int minute = instance.get(Calendar.MINUTE);
        System.out.println(year+"-"+month+"-"+day+"-"+hour+"-"+minute);
    }

    public void calendarTest(){
        System.out.print("请输入年份:");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.print("请输入月份:");
        int month = scanner.nextInt();
        System.out.println("日"+"\t"+"一"+"\t"+"二"+"\t"+"三"+"\t"+"四"+"\t"+"五"+"\t"+"六"+"\t");
        //判断是否是润年
        boolean flag = year%400==0||(year%4==0&&year%100!=0);

        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.YEAR,year);
        instance.set(Calendar.MONTH,month);
        int dom = instance.get(Calendar.DAY_OF_MONTH);
        int dof = instance.get(Calendar.DAY_OF_WEEK);
        int actualMaximum = instance.getActualMaximum(Calendar.DAY_OF_MONTH);
        int ms = instance.get(Calendar.MONTH);

        int count = 0;
        for (int i = 0; i <dof; i++) {
            count++;
            System.out.print("\t");
        }

        for (int i = 1; i <actualMaximum; i++) {
            count++;
            System.out.print(i+"\t");
            if (count==7){
                count=0;
                System.out.println();
            }
        }

    }
}
