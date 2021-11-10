package com.junit;



public class App {
  
    private String message;
    public static void main(String[] args) {
        System.out.println("Hello World!");

    }
    public int addition(int x, int y)
    {
        System.out.println(x + y);
        return x + y;
    }
    public App(String message)
    {
        this.message = message;
    }
    public boolean isOdd(int value)
    {
        return  value % 2 == 1;
    }
    public String printMessage()
    {
        System.out.println(message);
        return message;
    }
    
}
