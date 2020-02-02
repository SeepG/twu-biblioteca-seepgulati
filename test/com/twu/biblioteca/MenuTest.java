package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MenuTest {
    Menu menuOptions;
    @Before
    public void BeforeEachTest(){
        menuOptions = new Menu();
    }
    @Test
    public void TestGetMenu(){
        String expectedOutput = "Please select an option to continue\n 1. List of books";

        String actualOutput = menuOptions.GetMenu();
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void TestSelectOption(){
        String expectedOutput = " - The Art of Computer Programming | Donald Knuth | 2011\n" +
                " - Clean Code: A Handbook of Agile Software Craftsmanship | Robert Cecil Martin | 2008\n" +
                " - The Pragmatic Programmer: From Journeyman to Master | Andy Hunt and Dave Thomas | 1999\n" +
                " - Cracking the Coding Interview: 189 Programming Questions and Solutions | Gayle Laakmann McDowell | 2015\n";

        String actualOutput = menuOptions.SelectOption("1");

        assertNotNull(actualOutput);
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void TestInvalidOptionSelection(){
        String expectedOutput = "Please select a valid option! or select 0 to exit";
        String actualOutput = menuOptions.SelectOption("2");
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void TestInvalidOptionAlphabetSelection(){
        String expectedOutput = "Please select a valid option! or select 0 to exit";
        String actualOutput = menuOptions.SelectOption("asdasdsa");
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void TestExitOptionSelection(){
        String expectedOutput = "Thank you for visiting Biblioteca";
        String actualOutput = menuOptions.SelectOption("0");
        assertEquals(expectedOutput,actualOutput);
    }

}