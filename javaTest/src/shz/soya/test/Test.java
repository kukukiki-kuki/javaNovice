package shz.soya.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    //数组的使用
    public void arrayTest(){
        //数组的初始化
        int a [] = new int[]{1,2,3,4,5,6};
        int b [] = new int[]{4,5,6,7,8,9};
        String strings [] = new String[6];

        for (int i = 0;i<strings.length;i++) {
            strings[i] = String.valueOf(b[i]);
            //System.out.print(strings[i]);
        }

        String str [] = new String[]{"world","hello"};
        System.out.println(str[1]);
    }
    public void arrayTest1(){
        //数组训练
        //创建一个长度为10的数组，要求数组元素的值在1-99中，同时要求每个元素值不同

        int arr [] = new int[10];
        for (int i = 0; i <arr.length ; i++) {
           int v =(int)(Math.random() * 90 + 1);
           boolean flag = false;
           while (flag){
               for (int j = 0; j <i ; j++) {
                   if (v==arr[j]){
                       flag = true;
                       break;
                   }
               }
           }
           if (!flag){arr[i] = v;}

        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    //回型矩阵
    /*
    * 输入一个整数作为一个矩阵的大小，并输出回型矩阵
    * 例如输入4
    * 1   2  3  4
    * 12 13 14  5
    * 11 16 15  6
    * 10  9  8  7
    * */
    public void arrayTest2(){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[][] arr = new int[input][input];

        //对数组进行赋值
        //首先对外围进行赋值
        //未解决
        int num = 1;
        for (int i = 0; i < (input+1)/2; i++) {
            for (int j = 0; j <input ; j++) {
                arr[i][j] = num;
            }

        }

        //输出数组
        for (int i = 0; i <input; i++) {
            for (int j = 0; j <input ; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //排序算法
    public void arrayTest3(){
        int[] arr = new int[]{2,45,6,23,75,443,562,134,765,355,78,43,346,542};
        //快速排序
       // quickSort(arr);
        //冒泡排序
        bubbleSort(arr);

    }
    //快排
    public void quickSort(int[] arr){

    }
    //冒泡
    public void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1]){
                    int tem = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = tem;
                    flag =true;
                }
            }
            if (!flag){
                break;
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    //
}
