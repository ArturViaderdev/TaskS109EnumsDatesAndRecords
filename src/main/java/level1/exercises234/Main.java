package level1.exercise2;

public class Main {
    public static void main(String[] args)
    {
        Task task = new Task(Level.HIGH);
        Task task2 = new Task(Level.MEDIUM);
        Task task3 = new Task(Level.LOW);

        System.out.println(task.getLevel().getColor());
        System.out.println(task2.getLevel().getColor());
        System.out.println(task3.getLevel().getColor());

        Task task4 = new Task(Level.valueOf("HIGH"));
        System.out.println(task4.getLevel().getColor());
    }
}
