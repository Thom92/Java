import java.util.*;

public class FoodUp
{
   public static void main(String[] args)
   {
      giveMe();
      food();
      now();
      money();
   }
   public static void money()
   {
    int c = 0;
    if(c<10)
    {
      c+=11;
    }  
    else
    {
      System.out.println("Do nothing");
    }
      System.out.println("If it´s not possible");
      System.out.println("I need to work for: " + c + " more hours at work");
      System.out.println("At work");
   }
   public static void food()
   {
      System.out.println("Food");
   }
   public static void giveMe()
   {
      System.out.println("Give me");
      int a = 0;
      while(a <= 6)
      {
      a++;
      }
      System.out.println(a + "00g");
   }
   public static void now()
   {
      System.out.println("Now");
      int b = 0;
      
      while(b<=50)
      {
         b+=4;
      }
      System.out.println("for " + b + " kr. a day");
   }  
  
}  