package shz.soya.oopPlus;

import java.util.Date;
import org.jetbrains.annotations.NotNull;

public class MyDate implements Comparable{
    private int year;
    private int month;
    private int day;
    public MyDate(){

    }
    public MyDate(int year,int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @NotNull
    public boolean equals(MyDate myDate){
        if (this.year==myDate.year&&this.month==myDate.month&&this.day==myDate.day){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(@NotNull Object o) {
        if (this==o){
            return 0;
        }
        if (o instanceof MyDate myDate){
            int yearDistance = this.getYear()-myDate.getYear();
            if (yearDistance!=0){
                return yearDistance;
            }
            int monthDistance = this.getMonth()-myDate.getMonth();
            if (monthDistance!=0){
                return monthDistance;
            }
            return this.getDay()-myDate.getDay();
        }
        return 0;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
