public class Administration extends Employee
{
    private int vacation;



    public Administration(String name, String cpr, int hours, int vacation, int salary)
    {
        super(name, cpr, hours, salary);
        this.vacation = vacation;
    }

    public int getVacation()
    {
        return vacation;
    }
}
