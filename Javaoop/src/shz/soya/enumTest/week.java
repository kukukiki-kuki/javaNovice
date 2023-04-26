package shz.soya.enumTest;

public enum week {
    MONDAY("星期一","忙碌的一天"),
    TUESDAY("星期二","忙碌的第二天"),
    WEDNESDAY("星期三","忙碌的第三天"),
    THURSDAY("星期四","忙碌的第四天"),
    FRIDAY("星期五","忙碌的第五天"),
    SATURDAY("星期六","快活的第二天"),
    SUNDAY("星期日","快活的第二天");
    private final String dayName;
    private final String dayDes;

     week(String dayName,String dayDes){
        this.dayName = dayName;
        this.dayDes = dayDes;
    }

    public String getDayName() {
        return dayName;
    }

    public String getDayDes() {
        return dayDes;
    }

}
