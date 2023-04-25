package shz.soya.singletonModle;

public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.getInfo());

        User u2 = new User("li", "2222");
        System.out.println(u2.getInfo());
    }
}
