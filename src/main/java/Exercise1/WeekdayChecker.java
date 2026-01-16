package Exercise1;

public class WeekdayChecker {
    public static void checkDayType(Day day) {
        if (day.isWeekday()) {
            System.out.println(day + " is a Weekday");
        } else  {
            System.out.println(day + " is not a Weekday");
        }
    }


}
