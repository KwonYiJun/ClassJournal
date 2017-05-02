package classjournal.android.myapplicationdev.com.classjournal;

import java.io.Serializable;

/**
 * Created by 15031795 on 2/5/2017.
 */

public class dailyGrade implements Serializable{
    private String week;
    private String dg;

    public dailyGrade(String week, String dg) {
        this.week = week;
        this.dg = dg;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getDg() {
        return dg;
    }

    public void setDg(String dg) {
        this.dg = dg;
    }
}
