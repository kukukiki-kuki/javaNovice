package shz.soya.oop;

public class MyArraysTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1,4,46,6,7,8,5,434,56,345,3,23443};
          MyArrays myArrays = new MyArrays();
        int[] ints = myArrays.reverseArray(arr);
        myArrays.sortArray(arr,"dec");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+ "\t");
//        }
        System.out.println(myArrays.getMul(6));

    }
}
