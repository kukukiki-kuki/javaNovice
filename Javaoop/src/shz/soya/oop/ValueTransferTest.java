package shz.soya.oop;

public class ValueTransferTest {
    public static void main(String[] args) {
        ValueTransferTest valueTransferTest = new ValueTransferTest();
        int m =10;
        int n =20;
        System.out.println("m :"+m+"  n:"+n);
        valueTransferTest.swap(m,n);
        System.out.println("m :"+m+"  n:"+n);


    }
    public void swap(int m,int n){
        int temp = m;
        m  = n;
        n  = temp;
    }
}
