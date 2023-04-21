package shz.soya.oop;

public class MyArrays {
    //求最大值
    //求平均值
    //求和
    //求平均值
    //遍历数组
    //复制数组

    /**
     * 复制数组
     * @param arr 输入数组
     * @return 输出复制的数组
     */
    public int[] reverseArray(int[] arr){
        int length = arr.length;
        for (int i = 0; i <length/2 ; i++) {
            int temp = arr[i];
            arr[i] = arr[length-1-i];
            arr[length-1-i] = temp;
        }
        return arr;
    }
    //数组反转
    public int[] copyArray(int[] arr){
        return null;
    }
    //

}
