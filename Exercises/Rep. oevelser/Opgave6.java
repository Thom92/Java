//Opgaver 10 s. 462 

import java.io.*;
import java.util.*;


public class Opgave6
{
   public static void main(String[] args)
   throws FileNotFoundException
   {
      File f = new File("Fil.txt");
      System.out.println("Findes filen? " + f.exists());
      System.out.println("Kan filen læses? " + f.canRead());
      System.out.println("Størrelse af filen: " + f.length());
      System.out.println("Pathen for filen: " + f.getAbsolutePath());
      
      Scanner input = new Scanner(f);
      String str1 = input.nextLine();
      
      System.out.println();
      System.out.println();
      
      while(input.hasNextLine())
      {
         System.out.println(input.nextLine());
      }
      input.close();
      
      
      
      
   }  
   
   
}