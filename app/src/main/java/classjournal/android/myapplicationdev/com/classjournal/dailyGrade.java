package classjournal.android.myapplicationdev.com.classjournal;

import java.io.Serializable;

/**
 * Created by 15031795 on 2/5/2017.
 */

public class dailyGrade implements Serializable{
    private int week;
    private String dg;

    public dailyGrade(int week, String dg) {
        this.week = week;
        this.dg = dg;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public String getDg() {
        return dg;
    }

    public void setDg(String dg) {
        this.dg = dg;
    }
}
