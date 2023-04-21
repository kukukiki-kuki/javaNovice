package shz.soya.oop;

public class MyArraysTest {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7,8,5,434,56,345,3,23443};
        MyArrays myArrays = new MyArrays();
        int[] ints = myArrays.reverseArray(arr);
        //int[] ints1 = myArrays.reverseArray(ints);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "\t");
        }
    }
}
