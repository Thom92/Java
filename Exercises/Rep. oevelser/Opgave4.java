import java.util.*;
import java.lang.Math;

public class Opgave4
{  //Opgave 8 s. 336 Reges
   public static void main(String[] args)
   {
      System.out.println("Indtast et tal");
      System.out.println("Indtast alt andet end et tal for at afslutte");
      Scanner skan = new Scanner(System.in);
      
      int max = 0;
      int min = 0;
      int tal;
      
      /*int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;*/
      
      if(skan.hasNextInt())
      {
         tal = skan.nextInt();
         min = tal;
         max = tal;
      }
      
      while(true)
      {
         if(!skan.hasNextInt())
         {
            break;
         }
         tal = skan.nextInt();
         max = Math.max(tal, max);
         min = Math.min(tal, min);
      }
      System.out.println("Max value: " + max);
      System.out.println("Min value: " + min);
      System.out.println();
      System.out.println("Indtast nogle ord ");
      wordCount();
      
      
   }
   //Opgave 18 s. 338 Reges
   public static void wordCount()
   {
      Scanner skan = new Scanner(System.in);
      String ord = skan.nextLine();
      String[] ordArray = ord.split("\\s");
      int wordAmount = ordArray.length;
      
      System.out.println("Antal ord: " + wordAmount);
   }
}