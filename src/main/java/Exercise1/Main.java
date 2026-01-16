package Exercise1;

import static Exercise1.WeekdayChecker.checkDayType;

public class Main {
    public static void main(String[] args) {
        checkDayType(Day.MONDAY);
        checkDayType(Day.SATURDAY);

        Task task1 = new Task("Write report", Level.MEDIUM);
        Task task2 = new Task("Fix critical bug", Level.HIGH);

        task1.display();
        task2.display();

        try {
            Level level = Level.valueOf("HIGH");
            System.out.println("Found level: " + level);

            Level invalid = Level.valueOf("VERY_HIGH");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid enum value");
        }
    }
}