package com.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Unit test for simple App.
 */
class AppTest {
    String message = "Hello World";
    App app = new App(message);

    public static void main(String[] args) {
       
     }
    @Test
    void printMessage()
    {
       assertEquals(message, app.printMessage());
    }
    @Test
    void addition() {
        int one = 1;
        int two = 2;
        assertEquals(3, one+two);
    }


    
}
