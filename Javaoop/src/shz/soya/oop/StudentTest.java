package shz.soya.oop;


public class StudentTest {
    public static void main(String[] args) {
        Student lisoya = new Student(10, "lisoya", "石河子", 1, "1234567890");
        lisoya.setAddress("上海");
        MyData myData = new MyData(2000,10,23);
        //System.out.println(myData.getYear());
        lisoya.setAge(10);
        lisoya.setName("lishouyan");
        lisoya.setAddress("shanghai");
        lisoya.setId(10);
        System.out.println(lisoya.getName());

    }
}
