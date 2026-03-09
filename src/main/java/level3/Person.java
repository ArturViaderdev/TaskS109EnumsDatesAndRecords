package level3;

public record Person(String name, int age){
    public boolean isAdult()
    {
        return (age>=18);
    }

    public Person
    {
        if(age<18)
        {
            throw new IllegalArgumentException("Ha d'esser major d'edat.");
        }
    }
}
