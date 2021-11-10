import java.util.*;

//Opgave 1 s. 216
public class Opgave3
{
   
   Scanner skan = new Scanner(System.in);
   int maxNumber = skan.nextInt();
   
   public static void printNumbers()
   {
      
      int maxNumber = 20;
      
      for(int i = 1; i<=maxNumber; i++)
      {
         
         System.out.print("["+ i + "]" + " ");
      }
    }
   
   
   public static void main(String[] args)
   {
        printNumbers();
   }
}