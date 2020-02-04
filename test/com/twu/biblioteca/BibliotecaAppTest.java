package com.twu.biblioteca;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    String expectedOutput = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    BibliotecaApp obj = new BibliotecaApp ();

    @Test
    public void testGetWelcomeMessage() {
        String actualOutput = obj.GetWelcomeMessage();
        assertEquals(expectedOutput,actualOutput);
    }
}
