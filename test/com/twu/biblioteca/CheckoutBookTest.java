package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckoutBookTest {
    CheckoutBook checkoutObject;
    @Before
    public void BeforeEachTest(){
        checkoutObject = new CheckoutBook();
    }

    @Test
    public void CheckoutBookTest(){
        Book expectedOutput = new Book("The Art of Computer Programming","Donald Knuth",2011);
        Book actualOutput = checkoutObject.Checkout("The Art of Computer Programming");
        assertNotNull(actualOutput);
        assertEquals(expectedOutput.getName(),actualOutput.getName());
        assertEquals(expectedOutput.getAuthor(),actualOutput.getAuthor());
        assertEquals(expectedOutput.getPublicationYear(),actualOutput.getPublicationYear());
    }

    @Test
    public void CheckoutBookDoesntExist(){
        Book actualOutput = checkoutObject.Checkout("Life of Pi");
        assertNull(actualOutput);
    }

    @Test
    public void GetAvailableBooksTest(){
        String expectedOutput = " - The Art of Computer Programming | Donald Knuth | 2011\n"+
                " - Clean Code: A Handbook of Agile Software Craftsmanship | Robert Cecil Martin | 2008\n" +
                " - The Pragmatic Programmer: From Journeyman to Master | Andy Hunt and Dave Thomas | 1999\n" +
                " - Cracking the Coding Interview: 189 Programming Questions and Solutions | Gayle Laakmann McDowell | 2015\n"+
                "Please enter another book name or enter quit to exit the application";
        String actualOutput = checkoutObject.GetAvailableBooks();
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void ReturnIssuedBook(){
        Book expectedOutput = new Book("The Art of Computer Programming","Donald Knuth",2011);
        checkoutObject.Checkout("The Art of Computer Programming");
        Book actualOutput = checkoutObject.ReturnIssuedBook("The Art of Computer Programming");
        assertNotNull(actualOutput);
        assertEquals(expectedOutput.getName(),actualOutput.getName());
        assertEquals(expectedOutput.getAuthor(),actualOutput.getAuthor());
        assertEquals(expectedOutput.getPublicationYear(),actualOutput.getPublicationYear());
    }
}