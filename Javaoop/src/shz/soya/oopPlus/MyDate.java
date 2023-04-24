package shz.soya.oopPlus;

import java.util.Date;
import org.jetbrains.annotations.NotNull;

public class MyDate {
    private int year;
    private int month;
    private int day;
    public MyDate(){

    }
    public MyDate(int day,int month,int year){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @NotNull
    public boolean equals(MyDate myDate){
        if (this.year==myDate.year&&this.month==myDate.month&&this.day==myDate.day){
            return true;
        }
        return false;
    }
}
