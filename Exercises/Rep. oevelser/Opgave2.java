

public class Opgave2
{

   public static void main(String[] args)
   {
      //Opgave 6 s.155 Reges
      int rows = 7;
      for(int i = 1; i<=rows; i++)
      {
         for(int j = 0; j<i; j++)
         {  
            System.out.print(i);  
         }
         System.out.println("");
      }
     //Opgave 7 s.155 Reges
     System.out.println();
     for(int k = 1; k<=5; k++)
     {
         for(int n = 0; n<=(5-k); n++)
         {
            System.out.print(" ");
         }
         System.out.println(k);
     }
     System.out.println();
     //Den lille tabel
     for(int m = 1; m<=10; m++)
     {
         for(int n = 1; n<=10; n++)
         {
            System.out.print(m*n + "\t");
         }
         System.out.println();
     }
     
   }  
  
}
     
     
   
 