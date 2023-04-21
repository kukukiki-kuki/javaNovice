package shz.soya.oop;

public class MyData {
    private Integer year;
    private Integer mo;
    private Integer days;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMo() {
        return mo;
    }

    public void setMo(Integer mo) {
        this.mo = mo;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public MyData(Integer year, Integer mo, Integer days) {
        this.year = year;
        this.mo = mo;
        this.days = days;
    }
}
