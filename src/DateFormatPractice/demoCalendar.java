package DateFormatPractice;

import java.util.Calendar;

public class demoCalendar {
    public static void main(String[] args) {
        Calendar clr = Calendar.getInstance();
        System.out.println(clr.get(Calendar.WEEK_OF_YEAR));
    }
}
