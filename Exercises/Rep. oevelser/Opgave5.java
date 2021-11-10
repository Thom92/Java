import java.util.*;

public class Opgave5
{
   //Opgave 8 s. 408 Reges
   public static void main(String[] args)
   {
      System.out.println("Der rulles 2 terninger");
      System.out.println("Der skal indtastes et positivt tal");
      System.out.println("Indtast den sum mellem 2 og 12 du vil ramme");
      diceSum();
      System.out.println();
      printAverage();
   }
   public static void diceSum()
   {
      Random r = new Random();
      Scanner skan = new Scanner(System.in);
      int tal = skan.nextInt();
      int sum = 0;
      int forsøg = 0;
      
      
      
      
      while(sum != tal && tal>-1)
      {
         int roll1 = r.nextInt(6) +1;
         int roll2 = r.nextInt(6) + 1;
         sum = roll1 + roll2;
         forsøg++;
         if(tal>12)
         {
            break;
         }
         else if(tal<2)
         {
            break;
         }
         System.out.println("roll1 " + roll1 + "\nroll2: " + roll2);
         System.out.println("Sum: " + sum);
         System.out.println();
      }
      
   }
   //Opgave 5 - s.410 Reges
   public static void printAverage()
   {
      System.out.println("Indtast dine tal for at finde summen");
      Scanner skan = new Scanner(System.in);
      int sum = 0;
      System.out.println("Indtast -1 eller mindre for at stoppe");
      int tal = skan.nextInt();
      
      while(tal>-1)
      {
         sum += tal;
         System.out.println("Indtast -1 eller mindre for at stoppe");
         System.out.println("Du indtastede: " + tal);
         tal = skan.nextInt();
      }
      System.out.println("Sum = " + sum); 
   }
}