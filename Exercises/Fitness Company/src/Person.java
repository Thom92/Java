import java.util.ArrayList;
import java.util.List;

public class Person
{
    protected String name;
    protected String cpr;

    public String getName()
    {
        return name;
    }
    public String getCpr()
    {
        return cpr;
    }
    public Person()
    {

    }

    public Person(String name, String cpr)
    {
        this.name = name;
        this.cpr = cpr;
    }

    @Override
    public String toString() {
        return "\nName: " + name + "Cpr: " + cpr;

    }
}

