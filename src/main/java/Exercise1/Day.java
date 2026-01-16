package Exercise1;

public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWeekday() {
        return this != SATURDAY && this != SUNDAY;
    }
}
