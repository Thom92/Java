import java.util.*;

//Opgave 3 s.549 Reges

public class Opgave7
{
   public static void main(String[] args)
   {
     int[] array = {20, 4, 5, 17, 1, -12, -4, 47};
     System.out.println("Tal imellem min og max: " + countInRange(array, 4, 17));
     System.out.println();
     System.out.println("Antal tal i arrayet: " + (array.length));
    
   
   }
   
   public static int countInRange(int[] array, int minValue, int maxValue)
   {
      int k = 0;
      for(int i = 0; i < array.length; i++)
      {
         if(array[i] >= minValue && array[i] <= maxValue)
         {
            k++;
         }
      }
      return k;
   }

}