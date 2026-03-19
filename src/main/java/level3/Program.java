package level3;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public Program()
    {

    }

    public void start()
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

        List<PersonClass> personsOfClass = new ArrayList<>();
        try
        {
            personsOfClass.add(new PersonClass("Artur",43));
            personsOfClass.add(new PersonClass("Jose",30));
            personsOfClass.add(new PersonClass("Julio",10));
        }
        catch(IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }

        List<PersonClass> adultsOfClass = personsOfClass.stream()
                .filter(PersonClass::isAdult)
                .toList();
        adultsOfClass.forEach(adultOfClass-> System.out.println(adultOfClass.toString()));
    }
}
