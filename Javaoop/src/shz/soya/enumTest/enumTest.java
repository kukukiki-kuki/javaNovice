package shz.soya.enumTest;

public class enumTest {
    public static void main(String[] args) {
        String dayDes = week.FRIDAY.getDayDes();
        String dayName = week.FRIDAY.getDayName();
        System.out.println(dayName+"是打工人"+dayDes);
        week[] values = week.values();
        for (int i = 0; i <values.length ; i++) {
            System.out.println((values[i].ordinal()+1)+"->"+values[i].name());
        }

    }
}
