package level3;

public class PersonClass {
    private String name;
    private int age;
    public PersonClass(String name, int age)
    {
        if(age<18)
        {
            throw new IllegalArgumentException("Ha d'esser major d'edat.");
        }
        this.name = name;
        this.age=age;
    }

    public boolean isAdult()
    {
        return (age>=18);
    }

    @Override
    public String toString() {
        return "PersonClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
