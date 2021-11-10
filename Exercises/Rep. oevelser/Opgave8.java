import java.util.*;

public class Opgave8
{
   public static void main(String[] args)
   {
      BankAccount konto = new BankAccount("Name: Fred\nBalance: " , 500.0); 
      BankAccount konto2 = new BankAccount("\nName: Tom\nBalance: ", 750.0);
      konto.deposit(1000.0);
      konto2.deposit(1500.0);
      System.out.print(konto.toString());
      System.out.println(konto2.toString());
      System.out.println();
      System.out.println("Transfer 200 from Fred to Thom");
      konto.transfer(konto2, 200);
      System.out.println();
      System.out.println(konto);
      System.out.println(konto2);
   }
   //Opgave 11 s.608, Reges
   public static class BankAccount
   {
      private String name;
      private double balance = 0;
      private double transferFee= 0;
   
      public BankAccount(String name, double balance)
      {
         setName(name);
         this.balance = balance;
      }
      
      public void deposit(double amount)
      {
         balance = balance + amount; 
      }
      public void withdraw(double amount)
      {
         
         if(balance >= amount + transferFee)
         {
            balance = balance - (amount + transferFee);
         }
         else
         {
            System.out.println("Not enough money");
         }
      }
      //Opgave 13 s.608 Reges
      public void transfer(BankAccount acc, double amount)
      {
         transferFee = 5.00;
         if(balance > (amount + transferFee))
         {
            acc.deposit(amount);
            balance -= (amount + transferFee);
         }
         else
         {
            System.out.println("Not enuff money");
         }
      }
      //Opgave 12 s. 608 Reges 
      public String toString()
      {
         return name + "," + balance;
      } 
      //Excercise: Getters and setters
      public String getName()
      {
         return name;
      }
      public void setName(String name)
      {
         this.name = name;
      }
      public double getBalance()
      {
         return balance;
      }
      public double getTransferFee()
      {
         return transferFee;
      }
      public void setTransferFee(double transferFee)
      {
         this.transferFee = transferFee;
      }  
        
   }
}