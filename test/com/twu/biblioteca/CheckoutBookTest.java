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
    public void CheckoutTest(){
        Book expectedOutput = new Book("The Art of Computer Programming","Donald Knuth",2011);
        Book actualOutput = checkoutObject.Checkout("The Art of Computer Programming");
        assertNotNull(actualOutput);
        assertEquals(expectedOutput.getName(),actualOutput.getName());
        assertEquals(expectedOutput.getAuthor(),actualOutput.getAuthor());
        assertEquals(expectedOutput.getPublicationYear(),actualOutput.getPublicationYear());
    }

    @Test
    public void CheckoutTestBookDoesntExist(){
        Book actualOutput = checkoutObject.Checkout("Life of Pi");
        assertNull(actualOutput);
    }
}