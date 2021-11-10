public class Main
{
    public static void main(String[] args)
    {
        int i;
        System.out.println("Where searching for 3");
        for(i = 1; i<5; i++)
        {
            if(i == 3)
            {
                System.out.println("Current number: " + i);
            }
            else
            {
                System.out.println("We don't care about this number");
            }
        }
    }
}
