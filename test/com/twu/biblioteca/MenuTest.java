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
        String expectedOutput = "Please select an option to continue\n 1. List of books \n 2. Return a book \n 0. To exit";
        String actualOutput = menuOptions.GetMenu();
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void TestSelectOption(){
        String expectedOutput = "Please enter a book name to checkout";
        String actualOutput = menuOptions.SelectOption("1");
        assertNotNull(actualOutput);
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void TestInvalidOptionSelection(){
        String expectedOutput = "Please enter a book name to return";
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