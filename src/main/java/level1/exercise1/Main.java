package level1.exercise1;

public class Main {
    public static void main(String[] args)
    {
        getTypeOfDay(Day.dilluns);
        getTypeOfDay(Day.dimarts);
        getTypeOfDay(Day.dimecres);
        getTypeOfDay(Day.dijous);
        getTypeOfDay(Day.divendres);
        getTypeOfDay(Day.dissabte);
        getTypeOfDay(Day.diumenge);
    }

    private static void getTypeOfDay(Day day)
    {
        if(day == Day.dissabte || day == Day.diumenge)
        {
            System.out.println(day.toString() + " és cap de setmana.");
        }
        else
        {
            System.out.println(day.toString() + " és laborable.");
        }
    }
}
