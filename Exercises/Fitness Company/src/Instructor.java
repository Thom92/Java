public class Instructor extends Employee
{
  public Instructor(String name, String cpr, int hours, int salary)

    {
        super(name, cpr, hours, salary);
    }
    public int getSalary()
    {
        if(getHours() == 37)
        {
            return 23000;
        }
        else
        {
            return getHours() * 456;
        }
    }

}
