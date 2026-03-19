package level1.exercises234;

public class Program {
    public Program()
    {

    }

    public void start()
    {
        Task task = new Task(Level.HIGH);
        Task task2 = new Task(Level.MEDIUM);
        Task task3 = new Task(Level.LOW);

        System.out.println(task.getLevel().getColor());
        System.out.println(task2.getLevel().getColor());
        System.out.println(task3.getLevel().getColor());

        try
        {
            Task task4 = new Task(Level.valueOf("HIGH"));
            System.out.println(task4.getLevel().getColor());

            System.out.println("El color del següent nivell de medium és " + task2.getLevel().nextLevel().getColor());

            Task task5 = new Task(Level.valueOf("CAR"));
        } catch (IllegalArgumentException e) {
            System.out.println("Opció de enum incorrecta.");
        }

    }
}
