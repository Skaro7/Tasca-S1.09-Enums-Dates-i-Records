package Exercise1;

public class Task {
    private String name;
    private Level level;

    public Task(String name, Level level) {
        this.name = name;
        this.level = level;
    }

    public void display() {
        System.out.println("Task: " + name + " Level: " + level + " Color: " + level.getColor());
    }
}
