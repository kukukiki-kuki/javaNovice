package shz.soya.oopPlusPlus;

public class FinalTest {
    public static void main(String[] args) {
        Other o = new Other();
        new Something1().addOne(o);
    }
}
class Something {
    public int addOne(final int x) {
         return x+1;
    }
}

class Something1 {
    public void addOne(final Other o) {
        // o = new Other();
        o.i++;
    }
}
class Other {
    public int i;
}
