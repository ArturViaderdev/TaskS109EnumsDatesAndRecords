package level3;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class PersonTests {
    @Test
    public void personClassNotAdultError()
    {
        List<PersonClass> personsOfClass = new ArrayList<>();
        Assertions.assertThrows(IllegalArgumentException.class, ()-> personsOfClass.add(new PersonClass("Julio",10)));
    }

    @Test
    public void personNotAdultError()
    {
        List<Person> persons = new ArrayList<>();
        Assertions.assertThrows(IllegalArgumentException.class, ()-> persons.add(new Person("Julio",10)));
    }
}
