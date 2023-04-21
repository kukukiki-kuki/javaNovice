package shz.soya.oop;

public class MyArrays {
    //求最大值
    //求平均值
    //求和
    //求平均值
    //遍历数组
    //复制数组

    /**
     * 反转数组
     * @param arr 输入数组
     * @return 输出反转的数组
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
    //数组排序

    /**
     * 升序，降序方法
     * @param arr 输入
     * @return 输出
     */
    public int[] sortArray(int[] arr,String state){
        //判断降序，或者升序
        if ("dec".equals(state)){
            for (int i = 0; i < arr.length-1 ; i++) {
                for (int j = 0; j < arr.length-1 ; j++) {
                    if (arr[j]<arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }
        return arr;
    }
    //计算n！
    public int getMul(int n){
        if (n==1){
            return 1;
        }else {
            return getMul(n-1)*n;
        }
    }

}
