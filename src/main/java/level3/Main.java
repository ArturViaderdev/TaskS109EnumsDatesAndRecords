package level3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {

        List<Person> persons = new ArrayList<>();
        try
        {
            persons.add(new Person("Artur",43));
            persons.add(new Person("Jose",30));
            persons.add(new Person("Julio",10));
        }
        catch(IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }

        List<Person> adults = persons.stream()
                .filter(Person::isAdult)
                .toList();

        adults.forEach(adult-> System.out.println(adult.toString()));




    }
}
